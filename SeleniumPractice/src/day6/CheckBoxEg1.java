package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		WebElement  milk = driver.findElement(By.name("option1"));
		
//		System.out.println(milk.isSelected());
//		System.out.println(milk.isDisplayed());
//		System.out.println(milk.isEnabled());

		if(!milk.isSelected())
		{
			milk.click();
		}
	}

}
