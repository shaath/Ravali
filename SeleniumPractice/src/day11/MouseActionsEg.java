package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(gmail).perform();
//		Thread.sleep(5000);
//		act.contextClick().perform();
		
//		act.moveToElement(gmail).contextClick().build().perform();

		act.contextClick(gmail).perform();
	}

}
