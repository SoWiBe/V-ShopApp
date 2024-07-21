package infrastracture.service;

import infrastracture.abstractions.IProductsService;
import infrastracture.models.Product;
import infrastracture.repository.ProductRepository;
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
