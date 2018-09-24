package com.java.ssmmodule.dao;

import com.java.ssmmodule.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("user")
public interface UserDao {

    List<User> selectAll();
}
