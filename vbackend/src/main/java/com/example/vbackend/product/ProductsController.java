package com.example.vbackend.product;

import com.example.vbackend.infrastructure.models.Product;
import com.example.vbackend.infrastructure.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productsService.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id){
        return productsService.getProductById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product){
        product.setId(id);
        return productsService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id){
        productsService.deleteProduct(id);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productsService.getProducts();
    }
}
