package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement drop = driver.findElement(By.name("country"));
		
		Select s = new Select(drop);
		
//		s.selectByIndex(4);
//		s.selectByValue("BAHRAIN");
//		s.selectByVisibleText("INDIA");
		
		List<WebElement> options = s.getOptions();
		
		System.out.println(options.size());
		
		for(int i = 0; i < options.size(); i++){
			s.selectByIndex(i);
			String name = options.get(i).getText();
			System.out.println(name);
		}

	}

}
