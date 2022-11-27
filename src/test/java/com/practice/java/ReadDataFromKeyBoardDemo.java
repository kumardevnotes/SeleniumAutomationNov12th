package com.practice.java;

import java.util.Scanner;

public class ReadDataFromKeyBoardDemo {

	public static void main(String[] args) {

//		System.out.println("Please enter the age");
		Scanner scan = new Scanner(System.in);
//		int stdAge = scan.nextInt();
//
//		if (stdAge <= 14) {
//			System.out.println("Std is not in highschool");
//		} else
//			System.out.println("Std is  in highschool");

		System.out.println("Enter employee details:");
		int empId = scan.nextInt();

		// float empSalary = scan.nextFloat();

		boolean empMarStatus = scan.nextBoolean();
		
		String empName = scan.nextLine();
		
		System.out.println(empId);
		System.out.println(empMarStatus);
		
		System.out.println(empName);
		System.out.println("Enter employee Gender:");
		char empGender = scan.next().charAt(0);

		
		System.out.println(empGender);
//		System.out.println(empSalary);
		
		
	}

}
