package com.projetoportifolio.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoportifolio.demo.entities.User;
import com.projetoportifolio.demo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository useRepository;
	
	public List<User>findAll(){
		return useRepository.findAll();
	}
	
	public User findbyId(Long id) {
		Optional<User> user  = useRepository.findById(id);
		return user.get();
	}

}
