package uiComponets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	
        JavascriptExecutor js = (JavascriptExecutor)driver;
		//scrollToBottom of page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		driver.findElement(By.cssSelector(".dropdown button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".dropdown-content.show")));
		System.out.println(driver.findElement(By.cssSelector(".dropdown-content.show")).isDisplayed());

		driver.quit();
		
	}

	

}
