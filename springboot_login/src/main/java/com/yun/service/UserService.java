package com.yun.service;

import com.yun.dao.UserDao;
import com.yun.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User dologin(User user) {
        user=this.userDao.login(user.getUsername(), user.getPassword());
        return user;
    }
}
