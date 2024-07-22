package com.example.vbackend.infrastructure.service;

import com.example.vbackend.infrastructure.abstractions.IProductsService;
import com.example.vbackend.infrastructure.repository.ProductRepository;
import com.example.vbackend.infrastructure.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService implements IProductsService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
