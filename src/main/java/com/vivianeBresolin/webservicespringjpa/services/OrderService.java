package com.vivianeBresolin.webservicespringjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivianeBresolin.webservicespringjpa.entities.Order;
import com.vivianeBresolin.webservicespringjpa.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAllOrders(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> order = orderRepository.findById(id);
		return order.get();
	}

}
