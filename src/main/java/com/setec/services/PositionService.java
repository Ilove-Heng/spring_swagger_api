package com.setec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.setec.models.Position;
import com.setec.repositorys.PositionRepository;

@Service
public class PositionService {
	@Autowired
	PositionRepository positionRepository;
	
	public List<Position> getPositionAll() {
		return positionRepository.findAll();
	}

	public ResponseEntity<Object> save(Position position) {
		positionRepository.save(position);
		return new ResponseEntity<Object>("Position created", HttpStatus.CREATED);
	}

	public Position findPositionById(Integer id) {
		// TODO Auto-generated method stub
		return positionRepository.findById(id).get();
	}

	

}
