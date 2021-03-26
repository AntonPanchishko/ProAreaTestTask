package com.example.proareatesttask.service;

import com.example.proareatesttask.model.Product;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

    Product getById(Long id);

    Product getByName(String productName);
}
