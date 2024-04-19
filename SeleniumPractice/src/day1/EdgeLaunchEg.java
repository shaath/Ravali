package day1;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunchEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\RavaliRecordings\\Jars\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://selenium.dev");
	}

}
