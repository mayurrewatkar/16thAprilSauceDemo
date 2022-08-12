package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.LoginPOMClass;

public class TC_001PracticeTestNGLoginFunctionality extends TestBedClass {
	
	
	
	
	@Test
	public void loginfunctionality()
	{
		//validation
		String Expectedtitle="Swag Labs";
		String Actualtitle=driver.getTitle();
		Assert.assertEquals(Actualtitle,Expectedtitle);

	}
	
	
}
