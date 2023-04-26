package com.projetoportifolio.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoportifolio.demo.entities.Order;
import com.projetoportifolio.demo.entities.User;
import com.projetoportifolio.demo.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order>findAll(){
		return orderRepository.findAll();
	}
	
	public Order findbyId(Long id) {
		Optional<Order> order  = orderRepository.findById(id);
		return order.get();
	}

}
