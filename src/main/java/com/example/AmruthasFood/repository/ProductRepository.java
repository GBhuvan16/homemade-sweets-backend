package com.example.AmruthasFood.repository;

import com.example.AmruthasFood.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
