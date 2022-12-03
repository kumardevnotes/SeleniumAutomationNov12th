package com.interfacess.demo;

public class MyClass implements MyInterface{ //1 + 2 = 3

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.classMethod();
		obj.displayName();
		obj.displayId(1144);
	}

	public void classMethod() {
		System.out.println("I am coming from classMethod()");
	}

	@Override
	public void displayName() {
		System.out.println("JohnMiller");
	}

	@Override
	public void displayId(int stdId) {
		System.out.println(stdId);
	}
}
