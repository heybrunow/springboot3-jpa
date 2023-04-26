package com.projetoportifolio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoportifolio.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
