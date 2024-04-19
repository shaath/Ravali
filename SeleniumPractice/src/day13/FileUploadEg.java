package day13;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.gecko.driver", "D:\\RavaliRecordings\\Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		Thread.sleep(5000);

//		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\SharatChandra\\Desktop\\8114925.JPG");
		
		WebElement input = driver.findElement(By.id("photofile"));
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].click();", input);
		
		Thread.sleep(5000);
		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload1.exe");
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload2.exe");
		
		Robot r = new Robot();
		
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_C);
//		
//		r.keyPress(KeyEvent.VK_COLON);
//		r.keyRelease(KeyEvent.VK_COLON);
		
		//Create instance of Clipboard class
		Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
	
		String path = "C:\\Users\\SharatChandra\\Desktop\\8114925.JPG";
		//Set the String to Enter
		StringSelection ss = new StringSelection(path);
		 
		//Copy the String to Clipboard
		cp.setContents(ss, null);
		
		//Pasting the copied content
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
