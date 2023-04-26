package com.projetoportifolio.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoportifolio.demo.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		return ResponseEntity.ok().body(new User(1L, "JOSE", "jose@gmail", "99999999", "123456"));
		
	}
	
	

	
}
