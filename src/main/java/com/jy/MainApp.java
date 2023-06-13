package com.jy;

import com.jy.dao.OrderDao;
import com.jy.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //获取代理对象
        UserDao userDao = context.getBean("userDaoProxy", UserDao.class);
        //调用 UserDao 中的各个方法
        userDao.add();
        userDao.delete();
        userDao.get();
        userDao.modify();

        System.out.println("环绕增强================");
        OrderDao orderDao = context.getBean("orderDaoProxy", OrderDao.class);
        orderDao.add();
        orderDao.adds();
        orderDao.delete();
        orderDao.get();
        orderDao.modify();

        System.out.println("自动代理================");
        //获取 ApplicationContext 容器
        ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans2.xml");
        //获取代理对象
        UserDao userDao1 = context1.getBean("userDao", UserDao.class);
        //获取代理对象
        OrderDao orderDao1 = context1.getBean("orderDao", OrderDao.class);
        //调用 UserDao 中的各个方法
        userDao1.add();
        userDao1.delete();
        userDao1.modify();
        userDao1.get();
        //调用 OrderDao 中的各个方法
        orderDao1.add();
        orderDao1.adds();
        orderDao1.delete();
        orderDao1.get();
        orderDao1.modify();
    }

}
