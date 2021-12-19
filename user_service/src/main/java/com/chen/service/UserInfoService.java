package com.chen.service;


import com.chen.pojo.entity.UserInfo;

public interface UserInfoService {

     void insert(UserInfo user);

     void updateByUserId(UserInfo userInfo);
}
