package com.chen.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.pojo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
