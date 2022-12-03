package com.woniu.community.entity.vo;

import lombok.Data;

/**
 * vo是entity的一种细分,用于接收用户界面传参
 */
@Data
public class UserVO {
    private String username;
    private String password;
}
