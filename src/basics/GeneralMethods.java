package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://yatra.com/");
		
		String headingText=driver.findElement(By.xpath("//*[@class='main-heading']")).getText();
        System.out.println(headingText);
	}

}
