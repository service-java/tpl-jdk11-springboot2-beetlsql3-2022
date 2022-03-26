package com.example.demo.entity;

import java.util.Date;

import org.beetl.sql.annotation.entity.AutoID;
import org.beetl.sql.annotation.entity.Table;

import lombok.Data;

@Data
@Table(name="user")
public class User {
    @AutoID
    private Long id;
    private String name;
    private Integer age;

    private Date createTime;
    private Date updateTime;
}
