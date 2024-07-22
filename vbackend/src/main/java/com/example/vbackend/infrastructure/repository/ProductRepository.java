package com.example.vbackend.infrastructure.repository;

import com.example.vbackend.infrastructure.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
