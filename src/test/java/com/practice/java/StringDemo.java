package com.practice.java;

public class StringDemo {

	public static void main(String[] args) {
		
		String city = "NewYork"; //city[0]=N city[1]=e  city[2]=w  city[3]=Y  city[4]=o 
		                        // city[5]=r  city[6]=k
		
		//lentgh of the string is 7
		
		System.out.println(city);
		System.out.println(city.toUpperCase()); //NEWYORK
		System.out.println(city.toLowerCase()); //newyork
		System.out.println(city.charAt(3)); //Y
		System.out.println(city.concat(" NewJersy")); //NewYork NewJersy
		System.out.println(city.equals("NewJersy")); //false
		System.out.println(city.equalsIgnoreCase("NEWYORK")); //true
		System.out.println(city.length());
		System.out.println(city.isBlank()); //false
		
		city = "  NewYork  "; 
		System.out.println(city);
		System.out.println(city.trim()); //NewYork
		
		
	}

}
