package com.jy.dao.impl;

import com.jy.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class userDaoImpl implements UserDao {

    @Override
    public void print() {
        System.out.println("userDao实现类");
    }
}
