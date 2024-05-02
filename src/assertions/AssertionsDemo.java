package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	public void learningAssertions() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String expectedHeading = "Welcome to our store";
		
		boolean loginDisplayed=driver.findElement(By.cssSelector(".ico-login")).isDisplayed();
		
		System.out.println(loginDisplayed);
		
		Assert.assertTrue(loginDisplayed, "Login Button is not displayed");
		
		String actualHeading=driver.findElement(By.cssSelector(".topic-html-content-title h2")).getText();
		System.out.println(actualHeading);
		Assert.assertEquals(actualHeading, expectedHeading, "Headings did not match");
		
		
		driver.quit();
		
	}
}
