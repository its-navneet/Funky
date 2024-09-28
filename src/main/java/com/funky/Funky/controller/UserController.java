package com.funky.Funky.controller;

import com.funky.Funky.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.funky.Funky.service.UserService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/demo")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/abcd")
    public String connected(){
        System.out.println("hello");
        return "asdfghjkl";
    }

    @GetMapping("/getAllUser")
    public List<User> getUser(){
        return userService.getAllUser();
    }
}
