package com.practice.java;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		try {
			int a = 100;
			int b = 10;
			System.out.println(a / b);

			String name = "KJohn";
			System.out.println(name.toLowerCase());
		}
		catch (ArithmeticException e) {
			System.out.println("Caught an exception. Team is working on it." + e);
		}
		catch (NullPointerException e) {
			System.out.println("Caught an exception. Team is working on it." + e);
		}
		catch (Exception e) {
			System.out.println("generic exceptoion: " + e);
		}

		finally {
			//to close excel sheet
			System.out.println("This is executed all the time whether you get exception or not");
		}

		System.out.println("the maths % operation comleted without issues");

	}

}
