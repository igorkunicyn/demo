package com.example.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.entites.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private final List<Product> productList;

    @Autowired
    public ProductRepository() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

}
