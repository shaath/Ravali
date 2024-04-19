package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderEg1 {

	public static void main(String[] args) {
		
		String d = "06/September/2024";
		String[] split = d.split("/");
		String m_y = split[1]+" "+split[2];
		String day = split[0];
		System.out.println(day+"----"+m_y);
		
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.get("https://www.cleartrip.com/");	
		
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']/../../../../../preceding-sibling::div//*[local-name()='svg']")).click();
	
		WebElement cal = driver.findElement(By.xpath("//button/*[local-name()='svg']/*[local-name()='mask']/../.."));
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true)", cal);
		
		driver.findElement(By.xpath("//button/*[local-name()='svg']/*[local-name()='mask']/../..")).click();
	
		String act_m_y = driver.findElement(By.xpath("(//div[@class='DayPicker-Month']/div/div)[1]")).getText();
		
		while(!m_y.equalsIgnoreCase(act_m_y))
		{
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			act_m_y = driver.findElement(By.xpath("(//div[@class='DayPicker-Month']/div/div)[1]")).getText();
		}
		
		List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Day' or contains(@class, 'Edge') and @aria-disabled='false']"));
		for(int i = 0; i < days.size(); i++){
			String act_d = days.get(i).getAttribute("aria-label");
			System.out.println(act_d);
			
			if(act_d.contains(" "+day+" ")){
				days.get(i).click();
				break;
			}
		}
	}

}
