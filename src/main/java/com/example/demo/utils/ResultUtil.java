package com.example.demo.utils;

import com.example.demo.Entity.Result;

public class ResultUtil {
    public static  Result sucess(Object object){
        Result result=new Result();
        result.setCode(0);
        result.setMsg("sucess");
        result.setData(object);
        return result;
    }

    public static  Result sucess(){

        return sucess(null);
    }


    public static Result error(Integer code ,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
