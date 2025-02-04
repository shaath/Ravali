package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import functionDriven.Genericmethods;

public class TestNGMaster extends Genericmethods{
	
	public String expval, actval;
	public FileInputStream fi;
	public Properties pr;
	public String br = "Firefox", url = "http://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String f = "Nandi", l = "S", eid = "N879SP";
	public String ename = f+" "+l, uname = "AAAA"+f+l+"3377", pwd = "Test@85476321234";
	
	
	@BeforeTest
	public void orgLaunch() throws IOException{
		String prPath = "D:\\RavaliRecordings\\Workspace\\SeleniumPractice\\src\\com\\SeleniumPractice\\properties\\OrgHRm.properties";
		fi = new FileInputStream(prPath);
		pr = new Properties();
		pr.load(fi);
		
		expval = "LOGIN";
		brLaunch(br);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		Assert.assertEquals(expval, actval, "Launch Failed");
	}
	
	@BeforeClass
	public void orgLogin(){
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(expval, actval, "Login Failed");
	}
	
	@AfterClass
	public void orgLogout() throws InterruptedException{
		expval= "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(expval, actval, "Logout Failed");
	}
	
	@AfterTest
	public void orgClose(){
		driver.close();
	}
}
