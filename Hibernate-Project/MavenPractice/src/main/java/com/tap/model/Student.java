package com.tap.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	//Attributes
	@Id
	@Column(name="roll")
	private int roll;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
	
	//Constructors
	
	public Student() {
		super();
	}
	public Student(int roll, String name, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
	}
	
	//Setter and Getters 
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "[ "+roll + ", " + name + ", " + email + " ]";
	}
	
	
	
}

