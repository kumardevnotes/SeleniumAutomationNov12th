package com.practice.java;

public class StaticMethodsDemo {

	public static void main(String[] args) {

		System.out.println("This is being printed from main method()");
		// Calling the method in the main method
		displayEmpId();
		int abc = getEmpId();
		System.out.println(abc);
		updateEmpId(200);
//		updateEmpId(300);
//		updateEmpId(400);
//		updateEmpId(777);

		checkTheMaritalStatus(true);
		checkTheMaritalStatus(false);
		checkTheMaritalStatus(true);
	}

	public static void checkTheMaritalStatus(boolean status) {
		if (status) { // true 
			System.out.println("Employee is married");
		} else {
			System.out.println("Employee is not married");
		}
	}

	public static void updateEmpId(int empId) {
		System.out.println(empId + 1);
	}

	// Declaring a static method in java. This is void method means this returns
	// nothing
	public static void displayEmpId() {
		System.out.println("1133");
	}

	// This method has int return type. So it should return some integer value
	public static int getEmpId() {
		return 1122;
	}

}
