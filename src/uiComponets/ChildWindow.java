package uiComponets;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println("Parent window  Title :"+driver.getTitle());
		driver.findElement(By.xpath("//*[@class='example']/a")).click();
		
		/**
		 * grab window handles and iterate the set to switch to desired window
		 */
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		
		String parentWindow = it.next();
		String childWindow= it.next();
		driver.switchTo().window(childWindow);
		System.out.println("Child window Title :"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window  Title :"+driver.getTitle());
		driver.close();
	}

}
