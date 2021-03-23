package com.example.proareatesttask.repository;

import com.example.proareatesttask.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
