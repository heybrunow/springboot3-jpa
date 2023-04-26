package com.projetoportifolio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoportifolio.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
