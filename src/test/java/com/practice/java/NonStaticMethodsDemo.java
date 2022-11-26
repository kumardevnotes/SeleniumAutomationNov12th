package com.practice.java;

//Class is a blue print which contains methods and variables
public class NonStaticMethodsDemo {
	
	//Constructor is a special function in java whose name is same as ClassName
	//Default constructor
	NonStaticMethodsDemo(){
		System.out.println("I am a constructor");
	}
	
	//Parameterized constructor
	NonStaticMethodsDemo(String message){
		System.out.println("I am a constructor with message: "+message);
	}

	public static void main(String[] args) {
		System.out.println("we will discuss non-static methods now");
		
		//Creating an object for a class
		NonStaticMethodsDemo object = new NonStaticMethodsDemo();
		//Call non-static method using the above object
		object.displayEmpName();
		
		NonStaticMethodsDemo objectNew = new NonStaticMethodsDemo("Learn Selenium");
		objectNew.displayEmpName();
	}
	
	//Declaring a non-static method
	public void displayEmpName() {
		System.out.println("John Miller");
	}

}
