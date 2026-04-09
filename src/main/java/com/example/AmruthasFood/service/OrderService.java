package com.example.AmruthasFood.service;

import com.example.AmruthasFood.model.Order;
import com.example.AmruthasFood.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepository repo;

    public Order placeOrder(Order order){
        return repo.save(order);
    }

    public List<Order> getOrders(){
        return repo.findAll();
    }

    public Order updateStatus(String id, String status){
        Order o = repo.findById(id).get();
        o.setStatus(status);
        return repo.save(o);
    }
}
