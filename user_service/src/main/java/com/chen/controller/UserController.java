package com.chen.controller;

import com.chen.pojo.entity.UserInfo;
import com.chen.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/userInfo")
public class UserController {
    @Autowired
    private UserInfoService userInfoService;

    //添加个人信息
    @PostMapping("/insert")
    public void insertUser(@RequestBody UserInfo userInfo){

        userInfoService.insert(userInfo);

    }

    @GetMapping("/a")
    public String getUser(){
        return "lalallalalal";
    }

    public void updateByUserId(UserInfo userInfo){
        userInfoService.updateByUserId(userInfo);

    }




}
