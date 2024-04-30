package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MobileTesting {

	
	@Test
	public void firstMobileTest() {
		System.out.println("I am in first Mobile Test");
	}
	
	@BeforeClass
	public void beforeClassWebTest() {
		System.out.println("I am in before  Class");
	}
	
	@AfterClass
	public void afterClassWebTest() {
		System.out.println("I am in after  Class");
	}
}
