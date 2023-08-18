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
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "userName", nullable = true, length = 100)
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "gender")
	private String gender;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	@Column(name = "description")
	private String description;
	@Column(name = "salary")
	private int salary;
	@Column(name = "phone")
	private int phone;
	@Column(name = "active")
	private int active;
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name = "positionId", nullable = true, referencedColumnName = "id")
	private Position position;
	@Column(name = "photo")
	private String photo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", description=" + description + ", salary=" + salary + ", phone="
				+ phone + ", active=" + active + ", position=" + position + ", photo=" + photo + ", getId()=" + getId()
				+ ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + ", getGender()="
				+ getGender() + ", getDateOfBirth()=" + getDateOfBirth() + ", getDescription()=" + getDescription()
				+ ", getSalary()=" + getSalary() + ", getPhone()=" + getPhone() + ", getActive()=" + getActive()
				+ ", getPosition()=" + getPosition() + ", getPhoto()=" + getPhoto() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
