package com.example.springboot.entity;

import lombok.Data;

@Data
public class User {
    //与数据库表之间的映射关系
    //是一个常用于Lombok库的注解，它为类自动生成标准的getter和setter方法
        private Integer id;
        private String name;
        private String username;
        private Integer age;
        private String sex;
        private String phone;
        private String address;
}
