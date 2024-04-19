package day12;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		Set<Cookie> s = driver.manage().getCookies();
		
		for(Cookie c : s)
		{
			System.out.println(c);
		}
		

	}

}
