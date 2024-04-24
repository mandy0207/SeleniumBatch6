package uiComponets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldeTables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
		 List<WebElement> contents = driver.findElements(By.xpath("//*[@id='dtBasicExample']/tbody/tr[4]/td"));

//		for( WebElement content : contents) {
//			System.out.println(content.getText());
//		}
		 
		 for(int i =0;i<contents.size();i++) {
			 System.out.println(contents.get(i).getText());
		 }
		
		driver.quit();
		
	}

}
