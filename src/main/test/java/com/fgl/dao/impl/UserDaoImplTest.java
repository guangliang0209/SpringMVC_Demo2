package com.fgl.dao.impl;

import com.fgl.dao.UserDao;
import com.fgl.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017\12\13 0013.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:mybatis/spring-mybatis.xml"})
public class UserDaoImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void selectById() throws Exception {
        long userId = 1l;
        User user = userDao.selectUserById(userId);

        System.out.println(user);
    }
}