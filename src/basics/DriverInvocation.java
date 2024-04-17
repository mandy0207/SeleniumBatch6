package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInvocation {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * ctrl+shift+o- > import packages
		 */
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//command to grab title 
		String title=driver.getTitle();
		System.out.println(title);
		
		//command to current URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//command to navigate backward
		driver.navigate().back();
		
		//waiting
		Thread.sleep(2000);
		
		//command to navigate forward
		driver.navigate().forward();
		
		//command to quit browser
		// closes entire browser.
		driver.quit();
		
		//close current window
		//driver.close();
		
	}

}
