package com.tap;

public class Audi implements Car{

	private RocketEngine rocketEngine;
	private String color;
	private float price;
	
	@Override
	public String getCarDetails() {
		return "Audi";
	}

	@Override
	public String getEngineDetails() {
		
		return rocketEngine.getEngineDetails();
	}
	
	public RocketEngine getRocketEngine() {
		return rocketEngine;
	}
	
	public void setRocketEngine( RocketEngine rocketEngine) {
		this.rocketEngine = rocketEngine;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
