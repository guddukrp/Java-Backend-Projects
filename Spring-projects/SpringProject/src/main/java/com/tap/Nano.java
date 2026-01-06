package com.tap;

public class Nano implements Car {

	private RocketEngine rocketEngine;
	
	public Nano(RocketEngine rocketEngine) {
		super();
		this.rocketEngine = rocketEngine;
	}
	
	@Override
	public String getCarDetails() {
		
		return "Nano";
	}
	@Override
	public String getEngineDetails() {
		 
		return rocketEngine.getEngineDetails();
			
	}
	
	

}
