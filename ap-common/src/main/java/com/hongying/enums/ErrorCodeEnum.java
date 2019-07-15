package com.hongying.enums;

public enum ErrorCodeEnum {
    SYSTEM_EXCEPTION(1,"系统错误"),
    HTTP_ERROR(2,"请求method,argument,body错误"),

    PARAM_ERROR(10000, "入参错误"),
    LOGIN_ERROR(10001,"用户未登录"),
    ;
    private int code;

    private String msg;

    ErrorCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
