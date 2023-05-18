package com.jy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

    private static final Log LOGGER = LogFactory.getLog(MainApp.class);

    public static void main(String[] args) {
       //获取ApplicationContext容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        SingletonBean singletonBean = context.getBean("singletonBean", SingletonBean.class);
//        SingletonBean singletonBean2 = context.getBean("singletonBean", SingletonBean.class);
//        System.out.println(singletonBean);
//        System.out.println(singletonBean2);

        PrototypeBean prototypeBean = context.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println(prototypeBean);
        System.out.println(prototypeBean2);
    }

}
