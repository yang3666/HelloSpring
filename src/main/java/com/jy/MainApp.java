package com.jy;

import com.jy.dao.UserDao;
import com.jy.dao.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.add();
        userDao.get();
        userDao.modify();
        userDao.delete();
    }

}
