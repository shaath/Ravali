package day12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		
		alt.dismiss();
	}
}
