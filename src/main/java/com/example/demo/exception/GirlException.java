package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;

/**
 * Created by Administrator on 2017-12-29.
 */
public class GirlException extends RuntimeException {
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private Integer code ;

    public GirlException(Integer code ,String message){
        super(message);
        this.code=code;
    }

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
}
