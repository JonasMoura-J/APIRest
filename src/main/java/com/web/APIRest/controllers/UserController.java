package com.web.APIRest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.APIRest.domain.Usuario;
import com.web.APIRest.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Usuario>> findAll() {
		
		List<Usuario> list = repository.findAll();
		
		return ResponseEntity.ok().body(list);
		
		
	}
}
