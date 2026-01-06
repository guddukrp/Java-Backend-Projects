package com.tap;

public class BMW implements Car{
	
	private RocketEngine rocketEngine;
	

	public BMW(RocketEngine rocketEngine) {
		super();
		this.rocketEngine = rocketEngine;
	}

	@Override
	public String getCarDetails() {
		
		return "BMW";
	}

	@Override
	public String getEngineDetails() {
		return rocketEngine.getEngineDetails();
	}
	
	
	
}
