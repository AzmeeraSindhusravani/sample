package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
 By username=By.id("email");
 By password=By.id("pass");
 By loginButton=By.id("u_0_b");
 public HomePage(WebDriver driver){
	this.driver=driver;
	
 }
 public void typeUserNmae(){
	 driver.findElement(username).sendKeys("sindhusravani123@gmail.com");
 }
 public void typePassword(){
	 driver.findElement(password).sendKeys("dadmom143");
 }
 public void LoginButton(){
	driver.findElement(loginButton).click(); 
 }
}
