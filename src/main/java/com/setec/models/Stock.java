package com.setec.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stock")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "addDate")
	private Date addDate;
	@Column(name = "ExpireDate")
	private Date ExpireDate;
	@Column(name = "Qty")
	private int Qty;
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name = "userId",nullable = true, referencedColumnName = "id")
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public Date getExpireDate() {
		return ExpireDate;
	}
	public void setExpireDate(Date expireDate) {
		ExpireDate = expireDate;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", addDate=" + addDate + ", ExpireDate=" + ExpireDate + ", Qty=" + Qty + ", user="
				+ user + ", getId()=" + getId() + ", getAddDate()=" + getAddDate() + ", getExpireDate()="
				+ getExpireDate() + ", getQty()=" + getQty() + ", getUser()=" + getUser() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
