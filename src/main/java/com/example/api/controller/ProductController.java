package com.example.api.controller;

import com.example.api.domain.product.Product;
import com.example.api.domain.product.ProductRepository;
import com.example.api.domain.product.RequestProduct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProducts(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public  ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
        Product newProduct = new Product(data);
//      System.out.println(data);
        repository.save(newProduct);
        return ResponseEntity.ok("tudo certo");
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data){
        Product product = repository.getReferenceById(data.id());
        product.setTitle(data.title());
        product.setImage(data.image());
        product.setPrice(data.price());
        return ResponseEntity.ok(product);
    }
}
