package com.vivianeBresolin.webservicespringjpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivianeBresolin.webservicespringjpa.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User userTest = new User(1L, "Maria", "maria@email.com", "99999-9999", "12345");
		return ResponseEntity.ok().body(userTest);
	}
}
