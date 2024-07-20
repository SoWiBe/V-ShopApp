package infrastracture.service;

import infrastracture.abstractions.IProductsService;
import infrastracture.models.Product;
import infrastracture.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductsService implements IProductsService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return product;
    }

    public Optional<Product> getProductById(Long id){
        var products = getProducts();
        for (var product : products){
            if(Objects.equals(product.getId(), id))
                return Optional.of(product);
        }

        return null;
    }



    public List<Product> getProducts(){
        return List.of(
                new Product(1L, "Test", 350)
        );
    }
}
