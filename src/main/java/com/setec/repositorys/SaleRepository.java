package com.setec.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setec.models.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {

	Sale findSaleById(Integer id);
	
}
