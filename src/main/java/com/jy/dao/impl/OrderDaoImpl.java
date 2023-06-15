package com.jy.dao.impl;

import com.jy.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void add() {
        System.out.println("正在执行OrderDao中的add()方法");
    }

    @Override
    public void delete() {
        System.out.println("正在执行OrderDao中的delete()方法");
    }

    @Override
    public Integer modify() {
        System.out.println("正在执行OrderDao中的modify()方法");
        return 1;
    }

    @Override
    public void get() {
        //异常
        int a = 10/0;
        System.out.println("正在执行OrderDao中的get()方法");
    }
}
