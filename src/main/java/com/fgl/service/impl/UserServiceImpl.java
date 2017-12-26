package com.fgl.service.impl;

import com.fgl.dao.UserDao;
import com.fgl.model.User;
import com.fgl.service.UserService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUsers(Long userId) {
        return userDao.selectUserById(userId);
    }
}
