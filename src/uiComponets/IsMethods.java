package uiComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		/**
		 * isSeelected: to check if checkbox, radio btn is checked or not
		 * isenabled : to check if checkbox, radio btn, btn is enaabled or clickable or not
		 * isDisplayed : to check whether element is displayed on ui or not
		 * 
		 */
		WebElement firstCheckbox = driver.findElement(By.xpath("(//*[@id='checkboxes']/input)[1]"));
		WebElement secondCheckbox = driver.findElement(By.xpath("(//*[@id='checkboxes']/input)[2]"));
		
		boolean isSeelectedFirst=firstCheckbox.isSelected();
		boolean isSeelectedSecond=secondCheckbox.isSelected();
		System.out.println("is Checked :"+isSeelectedFirst);
		System.out.println("is Checked :"+isSeelectedSecond);
		
		firstCheckbox.click();
		System.out.println(firstCheckbox.isSelected());
		
		System.out.println("is displayed :"+firstCheckbox.isDisplayed());

		System.out.println(firstCheckbox.isEnabled());
	}

}
