package com.practice.java;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// A variable stores only one value at any given point of time
		int emId = 1122;  // -2 -1 0 1 2 3 4...1122 1123
		//System.out.println(emId);
		
		emId = 3344;
		//System.out.println(emId);
		
		//An array can store multiple values into a single variable
		//Array stores same type of data only - Homegenous data
		//declaring and assigning values into array
		int empIds[] = {1122, 1123, 1124, 1125, 1126, 1122, 1123, 1124, 1125, 1127676, 6565, 65656565};
		//empIds[0]= 1122  empIds[1]= 1122  empIds[2]= 1123  empIds[3]= 1124 empIds[4]= 1126

//		System.out.println(empIds[0]);
//		System.out.println(empIds[1]);
//		System.out.println(empIds[2]);
//		System.out.println(empIds[3]);
//		System.out.println(empIds[4]);
		
		// initialization ; condition ; incr/decr
		for(int i=0; i < empIds.length ; i++) { // 5 ; 5 < 5 --> false
			System.out.println(empIds[i]); // empIds[4] --> 1126
		}
		
		//Declaring an array along with size but not the values
		int[] stdIds = new int[3];
		
		//storeing or entering values into array
		for(int i=0; i < 3 ; i++) { //3<3
			stdIds[i] = 100; //stdIds[2] = 100
		}
		
		//prinitng  array values
		for(int i=0; i < stdIds.length ; i++) { 
			System.out.println(stdIds[i]); 
		}
		
	}

}
