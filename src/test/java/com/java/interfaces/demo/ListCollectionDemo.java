package com.java.interfaces.demo;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionDemo {

	public static void main(String[] args) {
		//Create an object for the class on the R.H.S and assigining it to the referemce variable of the 
		//interface on the L.H.S
		List myList = new ArrayList(); // ArrayList implements List --> 5 + 5 = 10
		
		//Store empDetails into one variable: empName empId empSala, empGender empMaritalStatus
		//List collection stores duplicate values
		// List elements can be accessed using index
		myList.add("John Legend"); //0
		myList.add(1122); //1
		myList.add(4000.5079); //2
		myList.add('M'); //3
		myList.add(false); //4
		
		
		for(Object obj : myList) {
			System.out.println(obj);
		}
		
		
		System.out.println(myList.get(2));
		myList.add("John Legend");
		
		
		List myChildList = new ArrayList(); 
		myChildList.add("NewJersy");
		
		//You can colelction to another collection and print it as shown below
		myList.addAll(myChildList);
		System.out.println(myList);
		
		//System.out.println(myList.contains("Mike"));
		
		System.out.println(myList.isEmpty()); //false
		myList.clear();
		System.out.println(myList.isEmpty()); //true
		
		myList.size(); //It will give the number of elements in the collection
		
		
	}

}
