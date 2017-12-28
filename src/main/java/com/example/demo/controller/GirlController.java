package com.example.demo.controller;

import com.example.demo.component.Girl;
import com.example.demo.services.GrilService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class GirlController {
    @Autowired
    private Girl girl;
    private  StringBuilder stringBuilder=null;
    @Autowired
    private GrilService grilService;

    @GetMapping("/gril")
    public String index(){
        stringBuilder=new StringBuilder("");
        stringBuilder.append(this.girl.getName());
        stringBuilder.append(this.girl.getAge());
        stringBuilder.append(this.girl.getCupSize());
        return stringBuilder.toString();
    }
    @PutMapping("/gril")
    public String updateGirl(){
        return "update sucess";
    }

    @PostMapping("/gril")
    public String addGirl(){
        return "add sucess";
    }

//    @PostMapping("/gril/valid")
//    public String addGirlByValid(@Valid Girl girl, BindingResult bindingResult){
//
//        return "add sucess";
//    }

    @GetMapping("/gril/err")
    public void getErr()throws Exception{
        grilService.testErr(1,2);
    }


}
