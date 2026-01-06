package com.tap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp3 {

	
	public static void main(String[] args) {
		//load application context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean
		
		Car car = (Car)context.getBean("bmw");
		
		
		//call getCarDetails
		
		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetails());
		
		//close context
		context.close();
	}
}
