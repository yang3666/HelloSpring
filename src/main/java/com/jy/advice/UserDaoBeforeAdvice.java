package com.jy.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 增强代码
 * MethodBeforeAdvice前置增强
 */
public class UserDaoBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("正在执行前置增强操作。。。。。。");
    }
}
