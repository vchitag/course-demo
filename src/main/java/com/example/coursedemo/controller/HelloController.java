package com.example.coursedemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello Buddy";
    }


    @RequestMapping("/topics")
    public String[] getTopics() {
        return new String[] {"Java", ".NET", "C++", "Oracle"};
    }
}
