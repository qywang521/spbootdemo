package com.example.demo.component;


import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;


@Component
public class Book {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Value("${book.author}")
    private String name ;

    @Value("${book.author}")
    private String author;

    public void testValue(){
        System.out.println(getName());
    }


}
