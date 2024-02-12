package org.guru.fakestore.service;

import org.guru.fakestore.dto.Product;
import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product getProductById(Long id);

    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(Long id);

}
