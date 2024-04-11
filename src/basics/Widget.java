package basics;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Widget {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://thekin-web-widget.staging.vetinsight.com/#/thekin_chat?auth_token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIwZjE4MzViOC0wMTllLTQxNzktYjgzNi0yM2M3YmFkZmU2ZjkiLCJzdWIiOiIxMzE0MCIsInNjcCI6InYyX3VzZXIiLCJhdWQiOm51bGwsImlhdCI6MTY5ODI0ODM0MSwiZXhwIjoyMDEzODE3ODYxfQ.wSrFLjkhYHXGvY1RYBQtVD1_NQYEYbAaiMyDXR9PVns");
		Cookie cookie1 = new Cookie("_ga", "GA1.1.249615312.1712764470", ".vetinsight.com", "/", null);
		Cookie cookie2 = new Cookie("_ga_LHWYSPEDR7", "GS1.1.1712764469.1.1.1712764771.60.0.0", ".vetinsight.com", "/",
				null);
		driver.manage().addCookie(cookie1);
		driver.manage().addCookie(cookie2);

	}

}
