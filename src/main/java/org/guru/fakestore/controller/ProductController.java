package org.guru.fakestore.controller;

import org.guru.fakestore.dto.Product;
import org.guru.fakestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/products")
public class ProductController {

    private ProductService ps;

    @Autowired
    public ProductController(ProductService ps){
        this.ps = ps;

    }

    @GetMapping()
    public ResponseEntity<List<Product>> getAllProduct() {
        return new ResponseEntity<>(ps.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) {
        return new ResponseEntity<>(ps.getProductById(id), HttpStatus.OK);
    }



}
