package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by crazyboy on 2017/11/18.
 */
//@RestController
    @Controller
public class helloboot {
//     @Value("${cupsize}")
//     private String cp;
    @Autowired
    private Girl girl;

     @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String hello(){
        //return girl.toString();
        return "/addbudget";
    }
 }
