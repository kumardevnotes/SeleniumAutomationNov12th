package com.testng.demo;

import org.testng.annotations.Test;

public class TestNGDemo2 {
	@Test (priority=0)
	public void testcase4() {
		System.out.println("testcase4 passed");
	}
	
	@Test  (priority=1)
	public void testcase5() {
		System.out.println("testcase5 passed");
	}

	@Test  (priority=2)
	public void testcase6() {
		System.out.println("testcase6 passed");
	}
	

}
