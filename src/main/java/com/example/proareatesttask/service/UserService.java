package com.example.proareatesttask.service;

import com.example.proareatesttask.model.User;

public interface UserService {
    User save(User user);

    User getById(Long userId);

    User update(User user);

    void delete(User user);

    User findByEmail(String email);
}
