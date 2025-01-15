package com.example.productapi.repository;

import com.example.productapi.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, Integer> {

    @Query(value = "{ 'price' : { $lt: ?0 } }")
    List<Product> findByPriceLessThan(int maxPrice);
}
