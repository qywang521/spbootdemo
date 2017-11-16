package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-11-16.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello spboot";
    }
}
