package com.projetoportifolio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoportifolio.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
