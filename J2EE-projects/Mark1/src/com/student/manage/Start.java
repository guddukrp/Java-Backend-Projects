package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Start {

	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Student Management System");
		
		while(true) {
			System.out.println("Press 1 for Add Student");
			System.out.println("Press 2 for Delete Student");
			System.out.println("Press 3 for display Student");
			System.out.println("Press 4 for exit");
			
			int n= Integer.parseInt(br.readLine());
			if(n==1) {
				
				System.out.println("Enter user name:");
				String name = br.readLine();
				System.out.println("Enter user phone:");
				String phone= br.readLine();
				System.out.println("Enter user city:");
				String city = br.readLine();
				
				Student st = new Student(name,phone,city);//create student object to store student details
				boolean ans = StudentDao.insertStudentToDB(st);
				if(ans) {
					System.out.println("Student is added successfully..");
				}else {
					
					System.out.println("Something went wrong");
				}
				
			}else if(n==2) {
				//delete
				System.out.println("Enter student name to delete");
				String userName=br.readLine();
				
				StudentDao.deleteStudent(userName);
				
				System.out.println("Student is successfully deleted");
				
			}else if(n==3) {
				StudentDao.printStudent();
				
			}else if(n==4) {
				break;
				
			}else {
				
			}
		}
		System.out.println("Thank you for using my application");
	}

}
