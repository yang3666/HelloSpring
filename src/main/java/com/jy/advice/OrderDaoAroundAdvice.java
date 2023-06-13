package com.jy.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 增强代码
 * 环绕增强
 */
public class OrderDaoAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕增强前。。。。");
        Object proceed = invocation.proceed();
        System.out.println("环绕增强后。。。。");
        return proceed;
    }
}
