package com.setec.models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Sale")
public class Sale {
	public Sale() {
		// TODO Auto-generated constructor stub
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@CreationTimestamp
	@Column(name = "saleDate", nullable = true)
	private Date saleDate;
	@Column(name = "userId", nullable = true)
	private int userId;
	@Column(name = "totalAmount", nullable = true)
	private double totalAmount;
	@OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
	private List<SaleDetail> saleDetails;
}
