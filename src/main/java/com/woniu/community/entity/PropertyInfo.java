package com.woniu.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyInfo {
    private int id;
    private int typeId;
    private double money;
    private String startDate;
    private String endDate;
    private int status;
    private int houseId;
    private String remarks;
    private String houseNumbers;
    private String ownerName;
    private String propertyType;
}
