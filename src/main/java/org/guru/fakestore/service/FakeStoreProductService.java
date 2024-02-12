package org.guru.fakestore.service;

import org.guru.fakestore.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    private WebClient webClient;

    @Autowired
    public FakeStoreProductService(WebClient webClient) {
        this.webClient = webClient;
    }
    public List<Product> getAllProduct() {
        return webClient.get()
                .retrieve()
                .bodyToFlux(Product.class)
                .collectList()
                .block();
    }

    public Product getProductById(Long id) {
        return webClient.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Product.class)
                .block();
    }

    public void addProduct(Product product) {
    }

    public void updateProduct(Product product) {
    }

    public void deleteProduct(Long id) {
    }
}
