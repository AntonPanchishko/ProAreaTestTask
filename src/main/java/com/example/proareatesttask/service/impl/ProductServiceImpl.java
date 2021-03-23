package com.example.proareatesttask.service.impl;

import com.example.proareatesttask.model.Product;
import com.example.proareatesttask.repository.ProductRepository;
import com.example.proareatesttask.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.getOne(id);
    }
}
