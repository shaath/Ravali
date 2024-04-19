package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_MouseActionsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
		//Mouse click on username textbox
		act.click(username).perform();
		Thread.sleep(5000);
		//Enter "Test" into user name text box
		act.sendKeys(Keys.chord("Test")).perform();
		Thread.sleep(5000);
		//double click
		act.doubleClick().perform();
		Thread.sleep(5000);
		//Pressing and holding control key, pressing c, Releasing control
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("C")).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		//mouse click on password 
		act.click(pass).perform();
		//Pressing and holding control key, pressing v, Releasing control
		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("V")).keyUp(Keys.CONTROL).build().perform();
	}

}
