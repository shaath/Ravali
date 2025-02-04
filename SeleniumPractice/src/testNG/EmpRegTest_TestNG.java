package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTest_TestNG extends TestNGMaster{

	@Test(dataProvider="data")
	public void orgEmpReg(String f, String l, String eid){
		System.out.println(f+"----"+l+"----"+eid);
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(expval, actval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data(){
		
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Vinayak";
		x[0][1] = "SB";
		x[0][2] = "VSB879";
		
		x[1][0] = "Narayan";
		x[1][1] = "S";
		x[1][2] = "NS854";
		
		x[2][0] = "Rama";
		x[2][1] = "S";
		x[2][2] = "RS859";
		
		x[3][0] = "Krishna";
		x[3][1] = "R";
		x[3][2] = "KR859";
		
		return x;
	}
}
