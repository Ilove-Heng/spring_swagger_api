package com.setec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/{id}")
	public User findUserById(@PathVariable Integer id) {
		return userService.findUserById(id);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUserById(@PathVariable Integer id){
		return userService.deleteUserById(id);
	}
	@PutMapping("/update")
	public ResponseEntity<Object> updateUserById(@RequestBody User user) {
		return userService.updateUserById(user);
	}
}
