package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class FullPageScreenshotEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.bing.com/");
		
		Thread.sleep(60000);
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\RavaliRecordings\\Workspace\\SeleniumPractice\\src\\screenShots\\Bing.png"));

		File src = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\RavaliRecordings\\Workspace\\SeleniumPractice\\src\\screenShots\\BingFullPage.png"));
	}

}
