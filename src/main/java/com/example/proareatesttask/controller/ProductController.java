package com.example.proareatesttask.controller;

import com.example.proareatesttask.mapper.ProductMapper;
import com.example.proareatesttask.model.Product;
import com.example.proareatesttask.model.dto.request.ProductRequestDto;
import com.example.proareatesttask.model.dto.response.ProductResponseDto;
import com.example.proareatesttask.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    @PostMapping
    public void create(@RequestBody ProductRequestDto productRequestDto) {
        productService.createProduct(productMapper.toEntity(productRequestDto));
    }

    @GetMapping("/{productId}")
    public ProductResponseDto update(@RequestBody ProductRequestDto productRequestDto,
                                     @PathVariable Long productId) {
        Product product = productMapper.toEntity(productRequestDto);
        product.setId(productId);
        return productMapper.toDto(productService.updateProduct(product));
    }

    @GetMapping
    public String get() {
        return "Hello world";
    }
}
