package guru.springframework.services;


import guru.springframework.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(int id);

    List<Product> listProducts();
}
