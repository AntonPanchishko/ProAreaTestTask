package com.example.proareatesttask.security;

import com.example.proareatesttask.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
