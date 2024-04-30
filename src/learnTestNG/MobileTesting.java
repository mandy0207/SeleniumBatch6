package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MobileTesting {

	
	@Test(groups="Regression")
	public void firstMobileTest() {
		System.out.println("I am in first Mobile Test");
	}
	
	@Test(groups="Smoke")
	public void secondMobileTest() {
		System.out.println("I am in second Mobile Test");
	}
	
	@BeforeClass
	public void beforeClassWebTest() {
		System.out.println("I am in before  Class");
	}
	
	@AfterClass
	public void afterClassWebTest() {
		System.out.println("I am in after  Class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Execute once before entire suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Execute once after entire suite");
	}
}
