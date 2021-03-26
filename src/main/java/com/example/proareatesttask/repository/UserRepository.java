package com.example.proareatesttask.repository;

import com.example.proareatesttask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getById(Long userId);

    User getByEmail(String email);
}
