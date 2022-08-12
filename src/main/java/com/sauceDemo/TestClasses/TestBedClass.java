package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.LoginPOMClass;
import com.sauceDemo.UtilityClasses.ScreenshotClass;

public class TestBedClass {
	
	WebDriver driver;
	
Logger log	=Logger.getLogger("sauceDemo");
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver Folder/chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		
		else if(browserName.equals("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", "./driver Folder/geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Throw error");
		}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is open");

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("Browser is maximize");

		ScreenshotClass.takescreenshot(driver);
		log.info("Screen shot is taken");
		
		//login
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUsername();
		log.info("username is entered");
		lp.sendPassword();
		log.info("password is entered");
		lp.clickloginbutton();
		log.info("loginbutton click");
		ScreenshotClass.takescreenshot(driver);
		log.info("Screeenshot is taken");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		log.info("Browser is close");
	
	}

	

}
