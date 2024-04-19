package day5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");

		File src = driver.findElement(By.xpath("//img[@alt='Google']")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\RavaliRecordings\\Workspace\\SeleniumPractice\\src\\screenShots\\GoogleLogo.jpg"));
		
	}

}
