package com.java.interfaces.demo;

import java.util.ArrayList;
import java.util.List;

public class CollectionsGeneric {

	public static void main(String[] args) {
		//If you want to store only specific type of data use this generics as shown below
		//Below myList stores only string data but not other data such as int/char
		List<String> myList = new ArrayList<String>();
		myList.add("John");
		myList.add("1122");
		System.out.println(myList);
	}

}
