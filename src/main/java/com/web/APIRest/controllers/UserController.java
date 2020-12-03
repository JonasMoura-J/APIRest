package com.web.APIRest.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.APIRest.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity <List<User>> findAll() {
		User jonas = new User(1, "Jonas", "Jonas@gmail");
		User maria = new User(2, "Maria", "Maria@gmail");
		
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(jonas, maria));
		
		return ResponseEntity.ok().body(list);
		
		
	}
}
