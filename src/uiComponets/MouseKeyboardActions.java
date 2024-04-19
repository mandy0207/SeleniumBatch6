package uiComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		/**
		 * Create an object of Actions class
		 */
		
		Actions act = new Actions(driver);
		WebElement others=driver.findElement(By.id("others"));
		
		//Hover over an element
		act.moveToElement(others).build().perform();
		
		WebElement messageInput=driver.findElement(By.id("single-input-field"));
		//click or sendkeys inside textbox
		act.moveToElement(messageInput).click().sendKeys("niteesha").build().perform();
		
		
		//double click on an element
		WebElement showMessage=driver.findElement(By.id("button-one"));
		act.moveToElement(showMessage).doubleClick().build().perform();
		
		//Right click
		act.moveToElement(showMessage).contextClick().build().perform();
		
		WebElement valueA=driver.findElement(By.id("value-a"));
		act.moveToElement(valueA).click().keyDown(Keys.SHIFT).sendKeys("vineetha").build().perform();

	}

}
