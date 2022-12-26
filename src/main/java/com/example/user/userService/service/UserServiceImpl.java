package com.example.user.userService.service;

import com.example.user.userService.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> list;

    public UserServiceImpl() {
        list = new ArrayList<>();
        list.add(new User(1, "Yashika Jain", "yashika@gmail.com"));
        list.add(new User(2, "Yashu", "yashu@gmail.com"));
    }

    @Override
    public List<User> getUsers() {
        return list;
    }

}