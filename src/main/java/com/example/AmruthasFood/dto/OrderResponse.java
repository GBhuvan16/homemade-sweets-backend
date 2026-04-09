package com.example.AmruthasFood.dto;

import lombok.Data;
import java.util.List;

@Data
public class OrderResponse {

    private String id;

    private String name;
    private String phone;

    private String status;

    private List<Object> items;

    private double total;
}