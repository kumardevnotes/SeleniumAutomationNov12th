package com.java.interfaces.demo;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionsDemo {

	public static void main(String[] args) {
		//HashSet implements Set --> 10 + 10  --> 20
		//We can create an object for the class HashSet and assign it to Set reference variable
		//We can never create an object for the interface
		//Set will not allow duplicate elements. Set will accept only unique elements/data
		//No indexing or positioning in Set
		Set mySet  = new HashSet();
		mySet.add("Sam"); // 0
		mySet.add(1000); //1
		mySet.add(1122); //2
		mySet.add('M'); //3
		
		mySet.add("Sam");
		System.out.println(mySet);
		
	
		
	}

}
