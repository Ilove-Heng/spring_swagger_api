package com.setec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setec.models.SaleDetail;
import com.setec.repositorys.SaleDetailRepository;

@Service
public class SaleDetailService {
	@Autowired
	SaleDetailRepository saleDetailRepository;

	public List<SaleDetail> getSaleDetailAll() {
		return saleDetailRepository.findAll();
	}
}
