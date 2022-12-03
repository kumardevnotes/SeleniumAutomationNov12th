package com.practice.java;

public class TestDemo {

	public static void main(String[] args) {
		
		//Standard expression to create object
		TestDemo myObj = new TestDemo();
		myObj.displayName();
		myObj.displayID();
	}

	//non-static
	private void displayID() {
		System.out.println(1122);
	}

	private void displayName() {
		System.out.println("John");
	}

}
