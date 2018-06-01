package com.forezp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiyaController {

    @Value("${my.age}")
    private int age;
    @Value("${my.name}")
    private String name;
    @RequestMapping("/miya")
    public String miya() {
      return  "name:"+name+",age:"+age;
    }
}
