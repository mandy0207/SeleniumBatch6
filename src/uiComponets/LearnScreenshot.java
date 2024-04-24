package uiComponets;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
	    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
	    File destFile = new File(System.getProperty("user.dir")+"\\screenshot"+getCurrentDateTime()+".png");
	
	    FileUtils.moveFile(srcFile, destFile);
	    
	    driver.quit();
	    
	}
	
	public static String getCurrentDateTime() {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return timeStamp;
	}

}
