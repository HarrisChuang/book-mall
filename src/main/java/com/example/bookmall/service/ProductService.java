package com.example.bookmall.service;

import com.example.bookmall.dto.ProductRequest;
import com.example.bookmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
