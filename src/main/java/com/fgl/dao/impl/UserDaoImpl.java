package com.fgl.dao.impl;

import com.fgl.dao.UserDao;
import com.fgl.model.User;
import com.xiaoleilu.hutool.util.ObjectUtil;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    protected SqlSession sqlSession;

    protected String className = this.getClass().getName() + ".";

    @Override
    public User selectUserById(Long id) {
        User user = null;
        if (ObjectUtil.isNotNull(id)) {
            user = sqlSession.selectOne(className + "selectUserById", id);
        }
        return user;
    }
}
