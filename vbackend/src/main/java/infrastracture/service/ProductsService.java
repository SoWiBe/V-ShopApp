package infrastracture.service;

import infrastracture.abstractions.IProductsService;
import infrastracture.models.Product;
import infrastracture.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService implements IProductsService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductsService(ProductRepository productRepository1){
        this.productRepository = productRepository1;
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
