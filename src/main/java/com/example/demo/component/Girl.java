package com.example.demo.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Value("${girl.age}")
    private Integer age;
    @Value("${girl.cupSize}")
    private String cupSize;
    @Value("${girl.name}")
    private String name ;

    @Override
    public String toString() {
        return "toString Method:"+this.getName()+this.getAge()+this.getCupSize();
    }

    public Girl() {
    }
}
