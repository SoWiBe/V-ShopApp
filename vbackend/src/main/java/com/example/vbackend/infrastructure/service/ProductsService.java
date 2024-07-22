package com.example.vbackend.infrastructure.service;

import com.example.vbackend.infrastructure.repository.ProductRepository;
import com.example.vbackend.infrastructure.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

     
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

     
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

     
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

     
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

     
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
