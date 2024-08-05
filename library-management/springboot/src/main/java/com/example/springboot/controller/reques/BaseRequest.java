package com.example.springboot.controller.reques;

import lombok.Data;



@Data
public class BaseRequest {
    //分页接口通用属性
    private Integer pageNum =1;
    private Integer pageSize =10;

}
