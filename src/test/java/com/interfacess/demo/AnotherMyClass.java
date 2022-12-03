package com.interfacess.demo;

public class AnotherMyClass implements MyInterface{ //1 + 2 = 3

	public static void main(String[] args) {
		AnotherMyClass obj = new AnotherMyClass();
		obj.classMethod();
		obj.displayName();
		obj.displayId(0001);
	}

	public void classMethod() {
		System.out.println("I am coming from AnotherMyClass");
	}

	@Override
	public void displayName() {
		System.out.println("Sam");
	}

	@Override
	public void displayId(int stdId) {
		System.out.println(stdId);
	}
}
