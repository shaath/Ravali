package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
//		driver.findElement(By.id("src")).sendKeys("Hyd");
		Thread.sleep(10000);
//		
//		List<WebElement> cities = driver.findElements(By.xpath("//div[@id='autoSuggestContainer']//li/div/text[1]"));
//		System.out.println("The number of cities available in the list " + cities.size());
//		
//		for (int i = 0; i < cities.size(); i++) 
//		{
//			String city = cities.get(i).getText();
//			System.out.println(city);
//			
//			if(city.equalsIgnoreCase("Miyapur")){
//				cities.get(i).click();
//				break;
//			}
//		}
		
		
		driver.findElement(By.id("onwardCal")).click();
		Thread.sleep(10000);
		String m_y = driver.findElement(By.xpath("//div[contains(@class, 'DayNavigator_')]/div[2]")).getText();
		System.out.println(m_y);
		while(!m_y.contains("Nov 2024")){
			System.out.println(m_y);
			driver.findElement(By.xpath(" //div[contains(@class, 'DayNavigator_')]/div[2]/following-sibling::div")).click();
//			Thread.sleep(5000);
			m_y = driver.findElement(By.xpath("//div[contains(@class, 'DayNavigator_')]/div[2]")).getText();
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//div[contains(@class, 'DayTiles__CalendarDaysBlock-')]/span"));
		for(int i = 0; i < days.size(); i++){
			String d = days.get(i).getText();
			if(d.equalsIgnoreCase("18")){
				days.get(i).click();
				break;
			}
		}
	}

}
