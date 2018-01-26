package com.example.demo.enums;

/**
 * Created by Administrator on 2017-12-29.
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    LIGHT_ERR(100,"小于错误"),
    GREAT_ERR(100,"大于错误");

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private Integer code;
    private String message;
}
