package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageNew {
	static WebDriver driver;
	public LoginPageNew(WebDriver ldriver){
		this.driver=ldriver;
	}
@FindBy(id="email") 
WebElement username;
@FindBy(id="pass")
WebElement password;
@FindBy(id="u_0_b")
WebElement loginbutton;
public void loginFacebook(String uid,String pwd){
	username.sendKeys(uid);
	password.sendKeys(pwd);
	loginbutton.click();
}

}
