package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import functionDriven.Genericmethods;

public class LoginTest extends Genericmethods {

	public static void main(String[] args) throws InterruptedException {
		
		brLaunch("Firefox");
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		lp.login();
		Thread.sleep(5000);
		AdminMenuPage amp = PageFactory.initElements(driver, AdminMenuPage.class);
		
		amp.welcomeclick();
		amp.logoutclick();
		
		driver.close();

	}

}
