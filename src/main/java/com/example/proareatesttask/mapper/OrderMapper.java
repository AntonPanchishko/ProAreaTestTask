package com.example.proareatesttask.mapper;

import com.example.proareatesttask.model.Order;
import com.example.proareatesttask.model.dto.request.OrderRequestDto;
import com.example.proareatesttask.service.ProductService;
import com.example.proareatesttask.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderMapper {
    private final UserService userService;
    private final ProductService productService;

    public Order toEntity(OrderRequestDto orderRequestDto) {
        Order order = new Order();
        order.setUser(userService.getById(orderRequestDto.getUserId()));
        List<String> productNames = orderRequestDto.getProductNames();
        order.setProducts(productNames
                .stream().map(productService::getByName).collect(Collectors.toList()));
        return order;
    }
}
