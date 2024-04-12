package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://yatra.com/");

		// grab text of any webelement
		String headingText = driver.findElement(By.xpath("//*[@class='main-heading']")).getText();
		System.out.println(headingText);

		WebElement oneWay = driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[1]/a"));
		// grabn value of any atribute
		String titleValue = oneWay.getAttribute("title");
		System.out.println(titleValue);

		//grab cssValue
		String cssValue = oneWay.getCssValue("color");
		System.out.println(cssValue);

		//ToolTip - value of title Attribute
		//Grab tootltip for RoundTrip

		driver.quit();

	}

}
