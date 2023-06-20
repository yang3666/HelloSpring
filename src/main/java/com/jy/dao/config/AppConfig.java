package com.jy.dao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.jy")//注解扫描
@EnableAspectJAutoProxy//开启AspectJ的自动代理
public class AppConfig {
}
