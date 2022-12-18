package com.java.interfaces.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//Map is one tye collection. It will store data in the form of key and value pairs
		Map<String, String> myMapObj = new HashMap<String, String>();
		myMapObj.put("appBrowser", "Edge");
		myMapObj.put("appUrl", "https://www.speaklanguages.com/english/");
		myMapObj.put("appUserEmailID", "johnnitesh2@gmail.com");
		myMapObj.put("apppassword", "Testing@123");
		myMapObj.put("appUserName", "nitesh");
		//If we try to assign a new value to the existing key, then the old value is overriden by new value
		myMapObj.put("appBrowser", "Chrome");
		myMapObj.put("myAppBrowser", "Chrome");
		
		//Keys are always unique but not values (You can have duplicate values)
		
		System.out.println(myMapObj);
	}

}
