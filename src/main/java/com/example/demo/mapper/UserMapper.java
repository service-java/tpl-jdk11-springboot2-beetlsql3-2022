package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.User;

import org.beetl.sql.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User> {
    List<User> listByAge(Integer age);
}
