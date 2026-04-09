package com.example.AmruthasFood.service;

import com.example.AmruthasFood.model.Product;
import com.example.AmruthasFood.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> getAll(){
        return repo.findAll();
    }

    public Product save(Product p){
        return repo.save(p);
    }

    public void delete(String id){
        repo.deleteById(id);
    }
}
