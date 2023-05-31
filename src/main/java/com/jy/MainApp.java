package com.jy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        //获取 ClassPathXmlApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }
}
