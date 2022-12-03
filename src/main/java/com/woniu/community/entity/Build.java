package com.woniu.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Build {
    private int id;
    private String numbers;
    private String units;
    private String remarks;
}
