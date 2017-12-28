package com.example.demo.handler;

import com.example.demo.Entity.Result;
import com.example.demo.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Result handler(Exception e){
        return ResultUtil.error(-1,e.toString());
    }

}
