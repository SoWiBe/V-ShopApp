package infrastracture.abstractions;

import infrastracture.models.Product;

import java.util.List;
import java.util.Optional;

public interface IProductsService {
    Product createProduct(Product product);
    List<Product> getProducts();
    Product updateProduct(Product product);
    Optional<Product> getProductById(String id);
    void deleteProduct(String id);
}
