package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;

public class TC003PracticeTestNGMultipleProductAddtoCart extends TestBedClass {
	
	
	
	
	@Test
	public void verifymultipleproductaddtocart()
	{
	//home page
		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		//hp.clickonbag();
		hp.clickAllProduct();
		String actualresult=hp.getTextFromCartButton();
		String expectedresult="6";
		
		//validation
		Assert.assertEquals(actualresult,expectedresult,"The result not match");
		
	}
	
	

}
