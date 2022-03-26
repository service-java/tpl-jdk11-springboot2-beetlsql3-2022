package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/api/user")
public class UserController {
    
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/listByName")
    @ResponseBody
    public List<User> listByName(String name) {
    
        log.info("param: " + name);
        List<User> list = userMapper.createLambdaQuery()
            .andLike(User::getName, name + "%")
            .select();
    
        return list;
    }

    @GetMapping("/listByAge")
    @ResponseBody
    public List<User> listByAge(Integer age) {
    
        log.info("param: " + age);
        List<User> list = userMapper.listByAge(age);
    
        return list;
    }

}
