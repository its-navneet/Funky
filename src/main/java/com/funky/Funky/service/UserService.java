package com.funky.Funky.service;

import com.funky.Funky.model.User;

import java.util.List;

public interface UserService {
    String saveUser(User user);

    List<User> getAllUser();
}
