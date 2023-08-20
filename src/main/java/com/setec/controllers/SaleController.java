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

import com.setec.models.Sale;
import com.setec.services.SaleService;

@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {
	@Autowired
	SaleService saleService;
	@GetMapping("")
	public List<Sale> getSaleAll() {
		return saleService.getSaleAll();
	}
	@PostMapping("")
	public ResponseEntity<Object> save(@RequestBody Sale sale){
		return saleService.save(sale);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteSaleById(@PathVariable Integer id){
		return saleService.deleteSaleById(id);
	}
	@PutMapping("/update")
	public ResponseEntity<Object> updateSaleById(@RequestBody Sale sale){
		return saleService.updateSaleById(sale);
	}
}
