package com.jy.service.impl;

import com.jy.dao.UserDao;
import com.jy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void out() {
        userDao.print();
        System.out.println("userService的实现类");
    }
}
