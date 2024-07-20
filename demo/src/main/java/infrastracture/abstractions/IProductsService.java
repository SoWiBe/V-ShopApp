package infrastracture.abstractions;

import infrastracture.models.Product;

import java.util.List;

public interface IProductsService {
    List<Product> getProducts();
}
