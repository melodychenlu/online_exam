package com.chen.service.impl;

import com.chen.dao.UserInfoMapper;
import com.chen.pojo.entity.UserInfo;
import com.chen.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;

@Service
public class UserInfoServiceInfoImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void insert(UserInfo user) {
        userInfoMapper.insert(user);
    }

    @Override
    public void updateByUserId(UserInfo userInfo) {
        userInfoMapper.updateById(userInfo);
    }
}
