package com.example.AmruthasFood.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Getter
@Setter
@Document(collection="products")
public class Product {
    @Id
    private String id;

    private String name;
    private double price;
    private String image;
    private String category;
    private boolean available = true;

    // ✅ CONSTRUCTOR YOU NEED
    public Product(){

    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // ✅ FULL constructor (optional)
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

