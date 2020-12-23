package com.facebook.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.facebook.pages.HomePage;
import com.facebook.pages.LoginPageNew;

public class verifyFacebookLogin {
	WebDriver driver;
	 @Test
	public void verifyValidLogin() throws Throwable{
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\LiveProject\\FacebookTesting\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	/*LoginPage login=new LoginPage(driver);
	login.typeUserNmae();
	login.typePassword();
	login.LoginButton();
	//driver.quit();
	*/	 
	
	LoginPageNew page = new LoginPageNew(driver);
	page.loginFacebook("sindhusravani123@gmail.com", "dadmom143");
	}
}
