package com.example.demo.product;

import com.example.demo.abstractions.IProductsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService implements IProductsService {

    public List<Product> getProducts(){
        return List.of(
                new Product(1L, "Test", 350)
        );
    }
}
