package com.tap.service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_customer_bean")
public class Employee {
	@Id
	@Column(name="uuid")
	private String uuid;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="address1")
	private String address1;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="phone1")
	private String phone1;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String uuid, String first_name, String last_name, String address1, String city, String state,
			String phone1) {
		super();
		this.uuid = uuid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address1 = address1;
		this.city = city;
		this.state = state;
		this.phone1 = phone1;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	@Override
	public String toString() {
		return "Employee [uuid=" + uuid + ", first_name=" + first_name + ", last_name=" + last_name + ", address1="
				+ address1 + ", city=" + city + ", state=" + state + ", phone1=" + phone1 + "]";
	}
	


}
