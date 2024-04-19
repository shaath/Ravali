package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		Thread.sleep(15000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links in google page " + links.size());
		
		for (int i = 0; i < links.size(); i++) {
			String lName = links.get(i).getText();
			System.out.println(lName);
		}
	}
}
