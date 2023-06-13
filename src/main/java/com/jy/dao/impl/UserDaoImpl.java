package com.jy.dao.impl;

import com.jy.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("正在执行UserDao的add()方法......");
    }

    @Override
    public void delete() {
        System.out.println("正在执行UserDao的delete()方法......");
    }

    @Override
    public void modify() {
        System.out.println("正在执行UserDao的modify()方法......");
    }

    @Override
    public void get() {
        System.out.println("正在执行UserDao的get()方法......");
    }
}
