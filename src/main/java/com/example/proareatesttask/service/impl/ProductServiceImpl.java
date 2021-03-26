package com.example.proareatesttask.service.impl;

import com.example.proareatesttask.model.Product;
import com.example.proareatesttask.repository.ProductRepository;
import com.example.proareatesttask.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

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

    @Override
    public Product getByName(String productName) {
        return productRepository.getByProductName(productName);
    }
}
