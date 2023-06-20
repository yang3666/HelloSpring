package com.jy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component//定义成Bean
@Aspect//定义为切面
public class MyAspect {

    @Before("execution(* com.jy.dao.UserDao.add(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置增强……" + joinPoint);
    }

    @After("execution(* com.jy.dao.UserDao.get(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("最终增强……" + joinPoint);
    }

    /**
     * 将com.jy.dao包下的UserDao类中的get()方法定义为一个切点
     */
    @Pointcut(value = "execution(* com.jy.dao.UserDao.get(..))")
    public void pointCut1() {

    }

    /**
     * 将com.jy.dao包下的UserDao类中的delete()方法定义为一个切点
     */
    @Pointcut(value = "execution(* com.jy.dao.UserDao.delete(..))")
    public void pointCut2() {

    }

    /**
     * 使用切入点引用
     */
    @Around("MyAspect.pointCut2()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕增强……1");
        proceedingJoinPoint.proceed();
        System.out.println("环绕增强……2");
    }

    /**
     * 使用切点表达式
     */
    @AfterReturning(value = "execution(* com.jy.dao.UserDao.modify(..))", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("后置返回增强。。。方法返回值为：" + returnValue);
    }
}
