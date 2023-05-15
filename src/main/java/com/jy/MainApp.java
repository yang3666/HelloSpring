package com.jy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    private static final Log LOGGER = LogFactory.getLog(MainApp.class);

    public static void main(String[] args) {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        JavaCollection javaCollection = context.getBean("javaCollection", JavaCollection.class);

        LOGGER.info(javaCollection.toString());

        System.out.println(javaCollection.toString());

    }

}
