package com.example.springlearning.controller;

import com.example.springlearning.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable String id) {
        System.out.println(id);
        return "根据ID获取用户信息:";
    }
    @PostMapping("/user")
    public String save(User user) {
        return "添加用户";
    }
    @PutMapping("/user")
    public String update(User user) {
        return "更新用户";
    }
    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable String id) {
        System.out.println(id);
        return "根据ID删除用户信息";
    }
}
