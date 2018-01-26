package com.example.demo.services;

import com.example.demo.Entity.Girl;

import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.GirlException;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;



@Service
public class GrilService {



    //@Transactional
    public void addGirl(Girl girl){

    }

    public void testErr(Integer i1, Integer i2) throws Exception{
        if(i1<i2){
            throw new GirlException(ResultEnum.LIGHT_ERR);

        }

    }
}
