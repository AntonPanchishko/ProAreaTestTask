package com.example.proareatesttask.repository;

import com.example.proareatesttask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
