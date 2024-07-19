package com.example.demo.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    public List<Product> getProducts(){
        return List.of(
                new Product(1L, "Test", 350)
        );
    }
}
