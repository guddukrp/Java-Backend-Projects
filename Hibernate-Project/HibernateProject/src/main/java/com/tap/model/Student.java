package com.tap.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tapstudent")
public class Student {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="10th")
	private int ten;
	
	@Column(name="12th")
	private int twe;
	
	@Column(name="grad")
	private int grad;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	public Student() {
	}

	public Student(int id, String name, int ten, int twe, int grad, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.ten = ten;
		this.twe = twe;
		this.grad = grad;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTen() {
		return ten;
	}

	public void setTen(int ten) {
		this.ten = ten;
	}

	public int getTwe() {
		return twe;
	}

	public void setTwe(int twe) {
		this.twe = twe;
	}

	public int getGrad() {
		return grad;
	}

	public void setGrad(int grad) {
		this.grad = grad;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [" + id + ", " + name + ", " + ten + ", " + twe + ", " + grad
				+ ", " + username + ", " + password + "]";
	}
	

}
