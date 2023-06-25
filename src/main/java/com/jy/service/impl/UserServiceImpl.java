package com.jy.service.impl;

import com.jy.dao.UserDao;
import com.jy.entity.User;
import com.jy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUer(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.update(user);
    }

    @Override
    public int deleteUser(User user) {
        return userDao.delete(user);
    }

    @Override
    public int countUser(User user) {
        return userDao.count(user);
    }

    @Override
    public List<User> getUserList(User user) {
        return userDao.getList(user);
    }

    @Override
    public User getUser(User user) {
        return userDao.getUser(user);
    }

    @Override
    public void batchAddUser(List<Object[]> batchArgs) {
        userDao.batchAddUser(batchArgs);
    }
}
