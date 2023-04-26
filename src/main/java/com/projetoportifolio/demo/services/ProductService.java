package com.projetoportifolio.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoportifolio.demo.entities.Product;
import com.projetoportifolio.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product>findAll(){
		return productRepository.findAll();
	}
	
	public Product findbyId(Long id) {
		Optional<Product> product  = productRepository.findById(id);
		return product.get();
	}

}
