package com.java.ssmmodule.controller;

import com.java.ssmmodule.entity.User;
import com.java.ssmmodule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller("userController")
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public String list(Map<String,Object> map){
        List<User> users = userService.getAll();
        map.put("list",users);
        System.out.println(users);
        return "index";
    }
}
