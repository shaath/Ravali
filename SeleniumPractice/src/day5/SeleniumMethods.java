package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
//		System.out.println("Title: " + driver.getTitle());
		
//		System.out.println("URL: " + driver.getCurrentUrl());

//		System.out.println(driver.getPageSource());
	}

}
