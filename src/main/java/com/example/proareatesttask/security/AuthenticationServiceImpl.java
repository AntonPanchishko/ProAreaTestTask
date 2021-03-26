package com.example.proareatesttask.security;

import com.example.proareatesttask.model.User;
import com.example.proareatesttask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;

    @Autowired
    public AuthenticationServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User register(String email, String password) {
        User newUser = new User();
        newUser.setEmail(email);
        newUser.setPassword(password);
        userService.save(newUser);
        return newUser;
    }
}
