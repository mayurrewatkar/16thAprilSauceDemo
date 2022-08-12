package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;

public class TC_004TestNGLogoutFunctionality extends TestBedClass {

	
	@Test
	public void logoutfunctionality()
	{
		
		
				
				//validation
				String expectedresult="Swag Labs";
				String actualresult=driver.getTitle();
				Assert.assertEquals(actualresult,expectedresult);
				


				
	}

}
