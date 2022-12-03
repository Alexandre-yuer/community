package com.woniu.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {
    private int id;//主键id
    private int storey;//楼层
    private String numbers;//房间号
    private int status;//状态
    private String intoDate;//入住时间
    private int  buildingId;//楼栋id
    private String remarks;//备注
    private double area;//面积
    private String buildingNumber;//楼号
    private String units;//单元
}
