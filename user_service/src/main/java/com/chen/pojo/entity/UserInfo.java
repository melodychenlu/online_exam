package com.chen.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private static final Long serialVersionUID = 8863043446374953595L;

    @TableId(value="id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String number;
    private String department;
    private String leader;
    private Integer phone;
}
