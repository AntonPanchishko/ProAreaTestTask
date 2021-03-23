package com.example.proareatesttask.mapper;

import com.example.proareatesttask.model.Product;
import com.example.proareatesttask.model.dto.request.ProductRequestDto;
import com.example.proareatesttask.model.dto.response.ProductResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toEntity(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setProductName(productRequestDto.getProductName());
        product.setPrice(productRequestDto.getPrice());
        return product;
    }

    public ProductResponseDto toDto(Product product) {
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setId(product.getId());
        productResponseDto.setProductName(product.getProductName());
        productResponseDto.setPrice(product.getPrice());
        return productResponseDto;
    }
}
