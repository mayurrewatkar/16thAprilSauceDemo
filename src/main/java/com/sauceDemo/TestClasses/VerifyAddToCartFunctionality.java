package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;
import com.sauceDemo.UtilityClasses.ScreenshotClass;

public class VerifyAddToCartFunctionality {
	
	public static void main(String[] args) throws IOException {
//	@Test
//	public void method1()
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		ScreenshotClass.takescreenshot(driver);
		
		//loginpage
		
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.clickloginbutton();
		ScreenshotClass.takescreenshot(driver);
		
		
		//Home page
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickonbag();
		hp.clickonAddToCartButton();
		String actualcount=hp.getTextFromCartButton();
		String expectedcount="1";
		
		//validation
	     
		if(actualcount.equals(expectedcount))
		{
			System.out.println("TC is pass");
		}
		
		else
		{
			System.out.println("TC is fail");
		}
		
		System.out.println("end program");
		driver.quit();
		
	}
}


