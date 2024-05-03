package learnExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReporting {

	ExtentReports extent;
	
	@BeforeTest
	public void generateReports() {
		String reportPath = System.getProperty("user.dir")+"//Reports//AutomationReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Obsqura Automation Report");
		reporter.config().setDocumentTitle("Obsqura Zone");
        extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Name", "Romy");
		extent.setSystemInfo("Environment", "QA");
	}
	
	@Test
	public void myfirstTest() {
		extent.createTest("myfirstTest");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.quit();
		
		extent.flush();
	}
	
	@Test
	public void mysecondTest() {
		ExtentTest test = extent.createTest("mySecondTest");
		test.log(Status.PASS, "I am passed");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
		extent.flush();
	}
	
	@Test
	public void failedTestCase() {
		ExtentTest test = extent.createTest("failed test case");
		test.fail("deliberately failing this test");
		extent.flush();
		Assert.fail();
	}
	
}
