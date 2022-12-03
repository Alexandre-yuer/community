package com.woniu.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    private int id;//主键id
    private String userName;//业主姓名
    private String tel;//联系方式
    private String sex;//性别
    private String identity;//身份证号
    private int houseId;//房屋外键
    private String remarks;//备注
    private String password;//密码
    private String numbers;//房间号
}
