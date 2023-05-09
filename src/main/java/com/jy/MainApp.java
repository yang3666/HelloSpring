package com.jy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    private static final Log LOGGER = LogFactory.getLog(MainApp.class);

    public static void main(String[] args)
    {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //获取名为 employee 的 Bean
        Employee employee = context.getBean("employee", Employee.class);

        //通过日志打印信息
        LOGGER.info(employee.toString());

        System.out.println(employee.toString());

    }

}
