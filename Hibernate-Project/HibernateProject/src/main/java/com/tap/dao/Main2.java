package com.tap.dao;

public class Main2 {

	public static void main(String[] args) {

		Service service = new Service();
		
		boolean checkUser = service.checkUser("gkp", "123");
//		System.out.println(checkUser);
//		System.out.println(service.printAllStudent());
		System.out.println(service.getStudent(1));
	}

}
