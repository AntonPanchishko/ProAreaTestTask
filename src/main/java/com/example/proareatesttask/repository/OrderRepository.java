package com.example.proareatesttask.repository;

import com.example.proareatesttask.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
