package com.woniu.community.entity;

import lombok.Data;

@Data
public class Records {
    private int id;
    private int typeId;
    private double num;
    private double num2;
    private int houseId;
    private String upTime;
    private String onTime;
    private String checkTime;
    private String meter;
    private String remarks;
    private String propertyName;//费用类型
    private String houseNumbers;//门牌号
    private String ownerName;//户主姓名
}
