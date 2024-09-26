package com.funky.Funky.controller;

import com.funky.Funky.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.funky.Funky.service.UserService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/message")
    public String connected(){
        return "Database Connected";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getUser(){
        return userService.getAllUser();
    }
}
