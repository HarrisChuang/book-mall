package com.example.bookmall.dao;

import com.example.bookmall.dto.ProductRequest;
import com.example.bookmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
