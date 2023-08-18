package com.setec.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setec.models.Position;



public interface PositionRepository extends JpaRepository<Position, Integer> {

}
