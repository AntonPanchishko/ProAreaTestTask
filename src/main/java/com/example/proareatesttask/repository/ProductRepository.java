package com.example.proareatesttask.repository;

import com.example.proareatesttask.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getByProductName(String productName);
}
