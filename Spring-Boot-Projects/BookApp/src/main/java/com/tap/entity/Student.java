package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int sid;
	@Column(name="name")
	private String name;
	@Column(name="phone")
	private String phone;
	@Column(name="city")
	private String city;
	
	public Student() {
		super();
	}
	public Student(String name, String phone, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [ name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}
	
	

}