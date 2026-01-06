package com.tap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {

	public static void main(String[] args) {

		//load application context
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get beans
		Car car = (Car)context.getBean("nano");
		
		//call getDetails()
		System.out.println(car.getCarDetails());	
		
		//close context object
		context.close();
		
		
	}

}


//Aggregation involves a relationship where objects are connected,
//			but the contained object can exist independently.
//				
//Composition involves a stronger relationship where one object owns 
//			and is responsible for the creation/destruction of the 
//			other object. The contained object has no independent existence.
