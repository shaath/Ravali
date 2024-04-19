package day10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandlingEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.get("https://www.gmail.com/");	
		
		String gmail_wId = driver.getWindowHandle();
//		System.out.println(gmail_wId);
		
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		Thread.sleep(30000);
		Set<String> s = driver.getWindowHandles();
		
		for(String wId: s)
		{
			System.out.println(wId);
			driver.switchTo().window(wId);
			
//			System.out.println(driver.getTitle());
//			if(driver.getTitle().contains("Privacy"))
//			{
//				driver.findElement(By.xpath("(//header[@id='gb']//a[text()='Terms of Service'])[1]")).click();
//				break;
//			}
			
			if(driver.getCurrentUrl().contains("policies.google.com")){
				driver.findElement(By.xpath("(//header[@id='gb']//a[text()='Terms of Service'])[1]")).click();
				break;
			}		
		}
		driver.switchTo().window(gmail_wId);
		System.out.println(driver.getTitle());
	}

}
