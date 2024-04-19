package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		
		driver.get("https://demo.automationtesting.in/ProgressBar.html");
		
		driver.findElement(By.id("cricle-btn")).click();
//		Thread.sleep(3000);
		boolean flag = driver.findElement(By.xpath("//div[text()='100']")).isDisplayed();
		System.out.println(flag);

	}

}
