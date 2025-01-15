package com.example.productapi.controller;

import com.example.productapi.model.Product;
import com.example.productapi.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody @Valid Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{reference}")
    public Product getProductById(@PathVariable int reference) {
        return productService.getProductById(reference);
    }

    @GetMapping("/filterMaxPrice")
    public List<Product> getProductsByMaxPrice(@RequestParam int maxPrice) {
        return productService.getProductsByMaxPrice(maxPrice);
    }

    @DeleteMapping("/{reference}")
    public void deleteProductById(@PathVariable int reference) {
        productService.deleteProductById(reference);
    }
}
