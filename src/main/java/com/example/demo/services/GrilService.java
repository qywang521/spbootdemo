package com.example.demo.services;

import com.example.demo.Entity.Girl;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;



@Service
public class GrilService {



    //@Transactional
    public void addGirl(Girl girl){

    }

    public void testErr(Integer i1, Integer i2) throws Exception{
        if(i1<i2){
            throw new Exception(i1+"<"+i2);

        }

    }
}
