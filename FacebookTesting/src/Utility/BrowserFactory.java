package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
 static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url) {
		if(browsername.equals("chrome")){
		driver=new ChromeDriver();	
		}else if(browsername.equals("firefox")){
			driver=new FirefoxDriver();	
		}else if(browsername.equals("IE")){
			driver=new InternetExplorerDriver();	
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
