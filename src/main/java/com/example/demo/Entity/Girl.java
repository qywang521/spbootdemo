package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017-12-27.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String cupSize;
    private Integer age;
}
