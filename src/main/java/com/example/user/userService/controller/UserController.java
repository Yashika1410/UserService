package com.example.user.userService.controller;

import com.example.user.userService.service.UserServiceImpl;
import com.example.user.userService.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String home() {
        return "Welcome to spring boot assignment";
    }

    //get users
    @GetMapping("/details")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }
}