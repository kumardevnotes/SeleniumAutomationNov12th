package com.java.interfaces.demo;

public class StdClass1 implements StateSchool { //2 methods +  1 = 3methods

	public static void main(String[] args) {
		
		StdClass1 stdClass1Obj = new StdClass1();
		stdClass1Obj.dislaySchoolName();
		stdClass1Obj.dislaySchoolName("Model High School");
		stdClass1Obj.getStdFee();
	}


	@Override
	public void dislaySchoolName() {
		System.out.println("Grammars High School");
	}

	@Override
	public void dislaySchoolName(String schoolName) {
		System.out.println(schoolName);
	}
	
	public int getStdFee() {
		return 1000;
	}

}
