package com.sky.common;

import lombok.Data;

/**
 * 通用返回结果
 */
@Data
public class R {
    private int code;
    private Object data;
    private String message;

    public R success(String message) {
        R r = new R();
        r.setCode(1);
        r.setMessage(message);
        r.setData(null);
        return r;
    }
    public R success(String message,Object data) {
        R r = new R();
        r.setCode(1);
        r.setMessage(message);
        r.setData(data);
        return r;
    }
    public R error(String message) {
        R r = new R();
        r.setCode(0);
        r.setMessage(message);
        return r;
    }

}
