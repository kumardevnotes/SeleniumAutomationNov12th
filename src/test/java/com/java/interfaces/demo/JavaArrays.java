package com.java.interfaces.demo;

public class JavaArrays {

	public static void main(String[] args) {
		//Arrays in Java store only same type of data  - Homogeneous data
		int empIds[] = {1122, 3344, 543, 6654, 6576}; //Integers only
		
		//Classic for loop
		for(int index = 0; index < empIds.length; index++) {
			System.out.println(empIds[index]);
		}
		
		//empName empId empSala, empGender empMaritalStatus
	    // 0 1 2 3 4
		
		//empIds[5] = 8888; // The size of the array is fixed. you ca not add new values into array
	}

}
