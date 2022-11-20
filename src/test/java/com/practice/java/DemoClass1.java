package com.practice.java;

public class DemoClass1 {
	
	public static void main(String[] args) {
		
		System.out.println("Emp Details:");
		int empID = 1001; //Integer data - 0, 1 , 100, -1, -200
		String empName ="John Legend"; //collection of chars
		String empAddress = "10-45, NY, 56565";
		float empSalary = 1000.7076767676454f; //to store decimal data upto 4 values
		double incentives = 100.75757575; //decimal data but it keeps upto 14 vaues after dot
		boolean empMaritalStatus = false; //true -married, false - not married
		char gender = 'M';

		System.out.println(empID+" "+empName+" "+empAddress+" "+empSalary+" "+incentives+" "+empMaritalStatus);
	}
	
}
