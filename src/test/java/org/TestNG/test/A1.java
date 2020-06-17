package org.TestNG.test;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A1 {
	
	@BeforeSuite
	
	public void sample1() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void sample2() {
		System.out.println("AfterSuite");
	}
	
	@BeforeClass
	
	public void sample3() {
		System.out.println("BeforeClass") ;
	}
	
	@AfterClass
	public void sample4() {
	System.out.println("Afterclass");	
	}
	
	@BeforeMethod
		public void sample5() {
			System.out.println("BeforeMethod");
		}
	@AfterMethod
	
	public void sample6() {
		System.out.println("AfterMethod");
	}
	
   @BeforeTest
   
   public void sample7() {
	   System.out.println("BeforeTest");
   }
	
	
	@AfterTest
	public void sample8() {
		System.out.println("AfterTest");
	}
	
	@Test
	public void sample9() {
		System.out.println("Test");
	}
		
	
}
