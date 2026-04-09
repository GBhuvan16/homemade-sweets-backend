package com.example.AmruthasFood.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.lang.annotation.Documented;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    @Id
    private String id;

    private String name;
    private String phone;
    private String address;

    private String payment;
    private String type;

    private List<Object> items;

    private double total;

    private String status = "Pending";
}
