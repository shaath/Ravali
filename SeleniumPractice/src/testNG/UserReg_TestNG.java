package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserReg_TestNG extends TestNGMaster {

	@Test
	public void orgUserReg() throws InterruptedException{
		boolean flag = false;
		expval = uname;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> eles = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for(int i = 0; i <= eles.size(); i++){
			List<WebElement> vv = eles.get(i).findElements(By.tagName("td"));
			
			actval = vv.get(1).getText();
			if(actval.equalsIgnoreCase(expval)){
				flag = true;
				break;
			}
		}
//		Assert.assertEquals(true, flag, "User Registration Failed");
		Assert.assertTrue(flag);
	}
}
