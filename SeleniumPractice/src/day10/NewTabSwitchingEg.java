package day10;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTabSwitchingEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");	

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://facebook.com");
	}

}
