package com.funky.Funky.serviceImplementation;

import com.funky.Funky.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.funky.Funky.repository.UserRepository;
import com.funky.Funky.service.UserService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    public String saveUser(User user){
        user.setJoining_time(LocalDateTime.now());
        userRepository.save(user);
        return "User Added Successfully";
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
