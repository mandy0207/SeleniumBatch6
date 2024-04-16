package uiComponets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioBtn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.findElement(By.xpath("//*[@id='gridCheck']")).click();
		/**
		 * Use click to Handle CheckBox and radio buttons 
		 */
	
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@class='check-box-list']"));
		
//		for(int i =0 ; i<checkBoxes.size();i++) {
//			checkBoxes.get(i).click();
//		}
		
		for(WebElement checkbox : checkBoxes) {
			checkbox.click();
		}
		
		driver.quit();
		

	}

}
