package com.jy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        /**
         * 使用BeanFactory获取Helloworld对象
         */
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
//        obj.getMessage();

        /**
         * 使用 FileSystemXmlApplicationContext 加载指定路径下的配置文件 Bean.xml
         */
        BeanFactory context = new FileSystemXmlApplicationContext("D:\\eclipe workspace\\spring workspace\\HelloSpring\\src\\Beans.xml");
        HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);
        obj.getMessage();
    }

}
