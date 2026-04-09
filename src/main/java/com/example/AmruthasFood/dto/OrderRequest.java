package com.example.AmruthasFood.dto;

import lombok.Data;
import java.util.List;

@Data
public class OrderRequest {

    private String name;
    private String phone;
    private String address;

    private String payment;
    private String type;
    private List<Object> items;

    private double total;
}