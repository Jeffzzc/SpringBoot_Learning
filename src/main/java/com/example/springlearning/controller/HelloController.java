package com.example.springlearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // https://localhost:8080/hello>nickname=zhangsan
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(String nickname,String phone){
        System.out.println(phone);
        return "hello" + nickname;
    }
}
