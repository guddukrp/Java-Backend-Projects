package com.tap.classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.impl.Airforce;
import com.tap.impl.Army;
import com.tap.impl.Navy;

public class Launch {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Airforce af = new Airforce(ac);
		Navy nv = new Navy(ac);
		Army ar = new Army(ac);
		
		af.addressPresident();
		nv.addressPresident();
		ar.addressPresident();
		
		

	}

}
