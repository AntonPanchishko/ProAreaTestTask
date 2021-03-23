package com.example.proareatesttask.controller;

import com.example.proareatesttask.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private final ProductMapper productMapper;
}
