package com.jy.dao.impl;

import com.jy.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void get() {
        System.out.println("正在执行UserDao的get方法");
    }

    @Override
    public void delete() {
        System.out.println("正在执行UserDao的delete方法");
    }

    @Override
    public void modify() {
        System.out.println("正在执行UserDao的modify方法");
    }

    @Override
    public void add() {
        System.out.println("正在执行UserDao的add方法");
    }
}
