package com.java.interfaces.demo;

public class StdClass2 implements StateSchool {

	public static void main(String[] args) {
		StdClass2 stdClass2Obj = new StdClass2();
		stdClass2Obj.dislaySchoolName();
		stdClass2Obj.dislaySchoolName("Model High School");
	}

	@Override
	public void dislaySchoolName() {
		System.out.println("The school Name is: ");
		System.out.println("Reynolds High School");	
		}

	@Override
	public void dislaySchoolName(String schoolName) {
		System.out.println("The given school Name is: ");
		System.out.println(schoolName);
	}
	
}
