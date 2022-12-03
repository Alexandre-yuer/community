package com.woniu.community.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpResult {
    private Object data;
    private int pageTotal;
    private int code;
    private String msg;
}
