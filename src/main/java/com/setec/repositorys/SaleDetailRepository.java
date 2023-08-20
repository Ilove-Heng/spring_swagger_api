package com.setec.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setec.models.SaleDetail;

public interface SaleDetailRepository extends JpaRepository<SaleDetail, Integer>{
	
}
