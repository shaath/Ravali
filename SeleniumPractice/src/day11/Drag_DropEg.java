package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
//		driver.switchTo().frame(0);
		WebElement f = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(f);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
 
		Actions act = new Actions(driver);
		
//		act.dragAndDrop(drag, drop).perform();
		
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		
		WebElement view = driver.findElement(By.xpath("//a[text()='Autocomplete']"));
		act.scrollToElement(view).perform();
	}

}
