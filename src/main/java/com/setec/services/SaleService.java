package com.setec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.setec.models.Sale;
import com.setec.repositorys.SaleRepository;

@Service
public class SaleService {
	@Autowired
	SaleRepository saleRepository;
	
	public List<Sale> getSaleAll() {
		return saleRepository.findAll();
	}

	public ResponseEntity<Object> save(Sale sale) {
		saleRepository.save(sale);
		return new ResponseEntity<Object>("Sale created", HttpStatus.CREATED);
	}

	public ResponseEntity<Object> deleteSaleById(Integer id) {
		Sale sale = saleRepository.findSaleById(id);
		if(sale == null) {
			throw new RuntimeException("Sale not found for id :" + id);
		}
		saleRepository.delete(sale); 
		return new ResponseEntity<Object>("Category deleted" + id, HttpStatus.OK);
	}
	public ResponseEntity<Object> updateSaleById(Sale sale){
		Sale SaleById = saleRepository.findSaleById(sale.getId());
		if(SaleById == null) {
			throw new RuntimeException("No found id :" + sale.getId());
		}
		saleRepository.save(sale);
		return new ResponseEntity<Object>("Sale updated" ,HttpStatus.OK);
	}
	
	
}
