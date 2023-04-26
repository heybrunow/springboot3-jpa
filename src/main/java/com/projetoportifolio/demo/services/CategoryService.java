package com.projetoportifolio.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoportifolio.demo.entities.Category;
import com.projetoportifolio.demo.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category>findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findbyId(Long id) {
		Optional<Category> category  = categoryRepository.findById(id);
		return category.get();
	}

}
