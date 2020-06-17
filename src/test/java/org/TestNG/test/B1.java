package org.TestNG.test;

import org.testng.annotations.Test;

public class B1 {
	
	@Test (enabled=false)
	
	public void sample1() {
		System.out.println("Test1");
	}
	
	@Test (invocationCount=5,enabled=false)
	public void sample2() {
		System.out.println("Test2");
	}

	@Test
	public void sample3() {
		System.out.println("Test3");
	}
	
	
}
