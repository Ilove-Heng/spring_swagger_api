package com.setec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.setec.models.Position;
import com.setec.services.PositionService;

@RestController
@RequestMapping("/api/v1/position")
public class PositionController {
	@Autowired
	PositionService positionService;
	@GetMapping("")
	public List<Position> getPositionAll(){
		return positionService.getPositionAll();
	}
	@PostMapping("")
	public ResponseEntity<Object> save(@RequestBody Position position){
		return positionService.save(position);
	}
	@GetMapping("/{id}")
	public Position findPositionById(@PathVariable Integer id) {
		return positionService.findPositionById(id);
	} 
	
}
