package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class OrgHRMLogin_Logout_Close {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "D:\\RavaliRecordings\\Jars\\chromedriver-win64\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();

		System.setProperty("webdriver.edge.driver", "D:\\RavaliRecordings\\Jars\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
//		username.click();
//		Thread.sleep(5000);
		username.sendKeys("Admin");
//		Thread.sleep(5000);
//		username.clear();
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
//		driver.close();
		driver.quit();

	}

}
