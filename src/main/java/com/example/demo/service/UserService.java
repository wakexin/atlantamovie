package com.example.demo.service;

import com.example.demo.po.User;

public interface UserService {
    User checkUser(String username, String password);
    User checkUserExist(String username);
    User saveUser(User user);
}
