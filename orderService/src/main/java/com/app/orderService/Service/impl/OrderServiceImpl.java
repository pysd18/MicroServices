package com.app.orderService.Service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.orderService.Entity.Order;
import com.app.orderService.Enum.Status;
import com.app.orderService.Repository.OrderRepository;
@Service
public class OrderServiceImpl {

    @Autowired
private OrderRepository orderRepository;


public Order placeOrder(Order order) {
order.setStatus(Status.PLACED);
return orderRepository.save(order);
}


public Order getOrder(UUID id) {
return orderRepository.findById(id).orElse(null);
}


public List<Order> getAllOrders() {
return orderRepository.findAll();
}

}
