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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="SaleDetail")
public class SaleDetail {
	public SaleDetail() {
		// TODO Auto-generated constructor stub
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne()
	@JoinColumn(name = "productId",nullable = true,referencedColumnName = "id")
	private Product product;
	@ManyToOne()
	@JoinColumn(name = "saleId",nullable = true,referencedColumnName = "id")
	private Sale sale;
	@Column(name = "qty")
	private int qty;
	@Column(name = "price")
	private double price;
	@Column(name = "amount", nullable = true)
	private double amount;
}
