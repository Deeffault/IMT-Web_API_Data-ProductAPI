package com.example.productapi.service;

import com.example.productapi.exception.ProductNotFoundException;
import com.example.productapi.model.Product;
import com.example.productapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        return productRepository.save(product);
    }

    public Product getProductById(int reference) {
        return productRepository.findById(reference)
                .orElseThrow(() -> new ProductNotFoundException("Produit non trouvé"));
    }

    public List<Product> getProductsByMaxPrice(int maxPrice) {
        return productRepository.findByPriceLessThan(maxPrice);
    }

    public void deleteProductById(int reference) {
        if (!productRepository.existsById(reference)) {
            throw new ProductNotFoundException("Produit non trouvé");
        }
        productRepository.deleteById(reference);
    }
}
