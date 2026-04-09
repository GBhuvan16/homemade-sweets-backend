package com.example.AmruthasFood.controller;

import com.example.AmruthasFood.dto.OrderRequest;
import com.example.AmruthasFood.model.Order;
import com.example.AmruthasFood.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class OrderController {

    @Autowired
    private OrderService service;
    @PostMapping("/order")
    public Order place(@RequestBody OrderRequest req){

        Order order = new Order();

        order.setName(req.getName());
        order.setPhone(req.getPhone());
        order.setAddress(req.getAddress());
        order.setPayment(req.getPayment());
        order.setType(req.getType());
        order.setItems(req.getItems());
        order.setTotal(req.getTotal());

        return service.placeOrder(order);
    }

    @GetMapping("/orders")
    public List<Order> get(){
        return service.getOrders();
    }

    @PutMapping("/order/{id}")
    public Order update(@PathVariable String id,
                        @RequestBody Order o){
        return service.updateStatus(id, o.getStatus());
    }
}

