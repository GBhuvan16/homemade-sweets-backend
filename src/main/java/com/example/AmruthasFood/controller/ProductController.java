package com.example.AmruthasFood.controller;

import com.example.AmruthasFood.model.Product;
import com.example.AmruthasFood.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Product add(@RequestBody Product p){
        return service.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }
}
