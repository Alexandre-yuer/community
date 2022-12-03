package com.woniu.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking {
    private int id;
    private String numbers;
    private int status;
    private int ownerId;
    private String remarks;
    private String ownerName;
    private String ownerTel;
}
