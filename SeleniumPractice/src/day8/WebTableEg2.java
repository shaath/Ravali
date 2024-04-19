package day8;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for(int i = 0; i < rows.size(); i++){
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			try
			{
				cols.get(0).findElement(By.tagName("input")).click();
			}
			catch(RuntimeException e)
			{
				System.out.println("There is no check box to click");
			}
			
		}

	}

}
