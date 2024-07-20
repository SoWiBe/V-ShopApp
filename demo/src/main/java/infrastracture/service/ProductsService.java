package infrastracture.service;

import infrastracture.abstractions.IProductsService;
import infrastracture.models.Product;
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
