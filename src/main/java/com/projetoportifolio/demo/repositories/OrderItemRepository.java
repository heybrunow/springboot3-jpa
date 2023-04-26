package com.projetoportifolio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoportifolio.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
