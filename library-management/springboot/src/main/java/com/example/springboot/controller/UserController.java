package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.controller.reques.UserPageRequest;
import com.example.springboot.entity.User;
import com.example.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @CrossOrigin//前端跨域
@RestController//标明这个类是一个Rest的Controller的接口
//controller实现数据传输浏览器，对外暴露API的

//和启动类的冲突，需要设置统一前缀
@RequestMapping("/user")//一级前缀
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/save")
    public Result save(@RequestBody User user){
        userService.save(user);
        return Result.success();
    }

    @GetMapping("/list")//二级前缀
    public Result listUsers() {
        List<User> users = userService.list();
        return Result.success(users);
    }

    //分页接口
    @GetMapping("/page")//二级前缀
    //第一种在 public Result page(@RequestParam)
    //第二种在controller里面建一个包request的UserPageRequest类
    public Result page(UserPageRequest userPageRequest) {
        return Result.success(userService.page(userPageRequest));
    }


}
