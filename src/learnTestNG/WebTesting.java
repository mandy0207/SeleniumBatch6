package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {
	
	/*
	 * 1. Anything method annotated with Test would be treated as a test case only.
	 * 2. Execution of method will follow the alphabetical order of method name
	 * 3. We can control the order of execution using priority. Lower priority will execute first(OOE= 0,1,2)
	 * 4. If any of test case  is not having priority defined, alphabetical order will take precedence.
	 * 5. BeforeTest will execute once before all the test cases present inside a class.
	 * 6. AfterTest will execute once after all the test cases present inside a class.
	 * 7. Before method will execute before every method (test case) present inside class
	 * 8. After method will execute after every method(test case) present inside class
	 * 9. Before class will execute first in a class level 
	 * 
	 */
	
	@Test
	public void firstWebTest() {
		System.out.println("I am inside first web test");
	}
	
	@Test(priority=0)
	public void secondWebTest() {
		System.out.println("I am inside second web test");
	}
	
	@Test(priority=1)
	public void thirdWebTest() {
		System.out.println("I am inside THIRD web test");
	}
	
	@BeforeTest
	public void beforeWebTest() {
		System.out.println("I am executing once before all tests");
	}
	
	@AfterTest
	public void afterWebTest() {
		System.out.println("I am executing oce after  all tests");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing before every method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executing after every method");
	}
	


}
