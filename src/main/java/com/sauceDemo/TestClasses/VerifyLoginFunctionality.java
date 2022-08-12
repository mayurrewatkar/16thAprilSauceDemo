package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.LoginPOMClass;

public class VerifyLoginFunctionality {
	
	public static void main(String[] args) {
		
	
	
	
	
		System.setProperty("webdriver.chrome.driver", "E:\\ChromDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		//login
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.clickloginbutton();
		
	
	
	
		//validation
				String Expectedtitle="Swag Labs";
				String Actualtitle=driver.getTitle();
				if(Expectedtitle.equals(Actualtitle))
				{
					System.out.println("Test case pass");
				}
				
				else
				{
					System.out.println("Test case fail");
				}
	
	
	
	
	
		
		driver.quit();
		System.out.println("end program");
	
		
		
		
		
		
		
	}
}



