package com.example.proareatesttask.service.impl;

import com.example.proareatesttask.model.Order;
import com.example.proareatesttask.repository.OrderRepository;
import com.example.proareatesttask.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
