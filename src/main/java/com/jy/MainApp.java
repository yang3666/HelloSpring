package com.jy;

import com.jy.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
        orderDao.add();
        orderDao.delete();
        orderDao.modify();
        orderDao.get();
    }

}
