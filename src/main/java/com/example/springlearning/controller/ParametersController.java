package com.example.springlearning.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;
import com.example.springlearning.entity.User;

@RestController
public class ParametersController {
    @RequestMapping(value="/getTest1",method= RequestMethod.GET)
    public String getTest1(){
        return "GET请求";
    }

    @RequestMapping(value="/getTest3",method= RequestMethod.GET)
    public String getTest3(@RequestParam(value="nickname",required = false) String nickname, String phone){
        System.out.println("nickname is " + nickname);
        return "GET请求";
    }

    @RequestMapping(value="/postTest2",method= RequestMethod.POST)
    public String postTest2(String username, String password){
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        return "POST请求";
    }

    @RequestMapping(value="/postTest3",method= RequestMethod.POST)
    public String postTest3(User user){
        System.out.println(user);
        return "POST请求";
    }

    @RequestMapping(value="/postTest4",method= RequestMethod.POST)
    public String postTest4(@RequestBody User user){
        System.out.println(user);
        return "POST请求";
    }

    @GetMapping("/test/**")
    public String test(){
        return "通配符请求";
    }
}
