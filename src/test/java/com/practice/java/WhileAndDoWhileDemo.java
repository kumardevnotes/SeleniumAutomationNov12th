package com.practice.java;

public class WhileAndDoWhileDemo {

	public static void main(String[] args) {

		int stdCount  = 10;
		
		//While loop is used to execute same statement multiple times 
		//depending on some condition evaluates to true
		//Do the execution laster and but check the condition first
		while(stdCount < 20) { //20 < 20 --> true
			System.out.println(stdCount); //11
			stdCount++; //19+1 = 20
		}
		
		//Do the execution first and then check the condition
		do { //20 < 20 --> true
			System.out.println(stdCount); //11
			stdCount++; //19+1 = 20
		} while (stdCount < 20);
	}

}
