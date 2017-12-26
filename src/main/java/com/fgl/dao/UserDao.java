package com.fgl.dao;

import com.fgl.model.User;


public interface UserDao {

    User selectUserById(Long id);
}
