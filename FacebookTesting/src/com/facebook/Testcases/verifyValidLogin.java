package com.facebook.Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.pages.HomePage;
import com.facebook.pages.LoginPageNew;

import Utility.BrowserFactory;

public class verifyValidLogin {
	static WebDriver driver;
@Test
	public void checkValidUser() throws InterruptedException{
	driver=BrowserFactory.startBrowser("chrome", "https:\\www.facebook.com");
	LoginPageNew login=	PageFactory.initElements(driver, LoginPageNew.class);
	login.loginFacebook("azmeerapriyanka134@gmail.com", "fastrack");
	String homepageurl=driver.getCurrentUrl();
	Assert.assertEquals(homepageurl, "https://www.facebook.com/");
	Thread.sleep(10000);
	driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//*[@id='mount_0_0']/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/i")).click();
	driver.findElement(By.xpath("//*[@id='mount_0_0']/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span")).click();
		}
@Test
public void checkHome() throws InterruptedException{
	//WebDriver driver=BrowserFactory.startBrowser("chrome", "https:\\www.facebook.com");
HomePage home=	PageFactory.initElements(driver, HomePage.class);
home.typeUserNmae();
home.typePassword();

	}

	}



