package uiComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement textBox= driver.findElement(By.cssSelector("[id='single-input-field']"));
		
		js.executeScript("arguments[0].value='Hello I am learning Selenium';", textBox);
		
		WebElement message = driver.findElement(By.cssSelector("[id='button-one']"));
		
		js.executeScript("arguments[0].click();", message);
		
		driver.quit();

	}

}
