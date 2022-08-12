package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;
import com.sauceDemo.UtilityClasses.ScreenshotClass;

public class TC_002PracticeTestNGSingleProductAddtoCart extends TestBedClass {
	
	
	
	
	
	@Test
	public void verifysingleproductaddtocart()
	{
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickonbag();
		hp.clickonAddToCartButton();
		String actualcount=hp.getTextFromCartButton();
		String expectedcount="1";
		
		//validation
	     
		Assert.assertEquals(actualcount,expectedcount);
		
	}
	


}
