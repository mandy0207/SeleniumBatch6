package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert {
	
	@Test
	public void learnSoftAssert() {
		
		/**
		 * soft Assert is used when we do not want to stop 
		 * execution of test case on assertion failures
		 * 
		 * But we can throw all assertion failures at last.
		 * 
		 */
		
		
		SoftAssert softAssert= new SoftAssert();
		String actualHeading = "Welcome to our shop";
		String expectedHeading = "Welcome to our store";
	
		softAssert.assertEquals(actualHeading, expectedHeading);
		
		System.out.println("First Assertion completed");
		
		softAssert.assertTrue(false);
		
		System.out.println("second Assertion completed");
		
		//In order to throw assertion failure we use this
		softAssert.assertAll();
		
		
	}

}
