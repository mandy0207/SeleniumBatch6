package uiComponets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		/**
		 * Implicit wait -> 
		 * 1. global wait - applied to all elements
		 * 2. will wait until given time units in implicit wait
		 * 
		 */
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		
		driver.findElement(By.cssSelector("[id='save']")).click();
		
		
		String personName=driver.findElement(By.cssSelector(".card-title")).getText();
		System.out.println(personName);
		
		driver.findElement(By.id("progress-bars")).click();
		driver.findElement(By.id("downloadButton")).click();
		/**
		 * Explicit wait 
		 * 
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".progress-label")), "Complete!"));
		
		System.out.println(driver.findElement(By.cssSelector(".progress-label")).getText());
		
		
		

	}

}
