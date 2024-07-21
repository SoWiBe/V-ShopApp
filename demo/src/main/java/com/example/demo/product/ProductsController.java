package com.example.demo.product;

import infrastracture.models.Product;
import infrastracture.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductsController {

    private final ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

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

}
