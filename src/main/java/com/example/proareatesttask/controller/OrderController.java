package com.example.proareatesttask.controller;

import com.example.proareatesttask.mapper.OrderMapper;
import com.example.proareatesttask.model.Order;
import com.example.proareatesttask.model.dto.request.OrderRequestDto;
import com.example.proareatesttask.service.OrderService;
import com.example.proareatesttask.util.MyPdfWriter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final OrderMapper orderMapper;
    private final MyPdfWriter pdfWriter;

    @PostMapping
    void completeOrder(@RequestBody OrderRequestDto orderRequestDto) {
        Order order = orderMapper.toEntity(orderRequestDto);
        orderService.save(order);
        pdfWriter.write(order.getProducts());
    }
}
