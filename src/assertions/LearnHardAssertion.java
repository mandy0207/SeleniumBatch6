package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnHardAssertion {

	
	@Test
	public void learnHardAssert() {
		
		/**
		 * Whenever there's a failure ,
		 * program will stop and will not go forward. This is called hard assertion failure
		 */
		
		String actualHeading = "Welcome to our store";
		String expectedHeading = "Welcome to our store";
	
		Assert.assertEquals(actualHeading, expectedHeading);
		
		System.out.println("First Assertion completed");
		
		int actualQuantity = 6;
		int expectedQuantity=6;
		
		Assert.assertEquals(actualQuantity, expectedQuantity);
				
		System.out.println("Second assertion completed");
		
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		
		
//		
//		String actualNames[]= {"Vineetha","Nitisha","Romy"};
//		String expectedNames[]= {"Vineetha","Nitisha","Romy"};
//		
//		Assert.assertEquals(actualNames,  expectedNames);
		
		
	}
}
