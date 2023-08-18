package com.setec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.setec.models.User;
import com.setec.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("")
	public List<User> getUserAll(){
		return userService.getUserAll();
	}
	@PostMapping("")
	public ResponseEntity<Object> save(@RequestBody User user){
		return userService.save(user);
	}
}
