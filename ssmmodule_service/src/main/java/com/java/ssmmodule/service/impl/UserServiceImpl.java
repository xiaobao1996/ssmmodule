package com.java.ssmmodule.service.impl;

import com.java.ssmmodule.dao.UserDao;
import com.java.ssmmodule.entity.User;
import com.java.ssmmodule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getAll() {
        return userDao.selectAll();
    }
}
