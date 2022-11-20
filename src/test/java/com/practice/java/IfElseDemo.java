package com.practice.java;

public class IfElseDemo {

	public static void main(String[] args) {

		// Control Structures
		int empSalary = 6000;
		boolean isMarried = false;
		
		/*
		 * && condition
		 * true && true --> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false
		 * */

		if (empSalary > 5000 && isMarried) { // 6000 > 5000 --> true && false --> false
			System.out.println("Employee is not eligible for tax payments");
		} else if (empSalary > 5000) { //6000 > 5000 --true
			System.out.println("Employee is eligible for tax payments");
		} else {
			System.out.println("Employee is not eligible for tax payments");
		}

		

		/*
		 * || condition
		 * true || true --> true
		 * true || false --> true
		 * false || true --> true
		 * false || false --> false
		 * */
	}

}
