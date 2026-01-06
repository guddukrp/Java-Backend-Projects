package com.tap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp4 {
	
	public static void main(String[] args) {
//		load application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
//		get bean
		Audi car = (Audi)context.getBean("audi");
		
//		call getCardetails
		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetails());
		
		System.out.println(car.getColor());
		System.out.println(car.getPrice());
		
		
//		close context object
		context.close();
	}

}
