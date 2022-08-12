package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.HomePagePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;

public class VerifyMultipleAddtoCart {
	
	public static void main(String[] args) {
		
		//open browser and url
		System.setProperty("webdriver.chrome.driver", "E:\\ChromDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//loginpage
		LoginPOMClass lp=new LoginPOMClass(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.clickloginbutton();
		
		//home page
		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		//hp.clickonbag();
		hp.clickAllProduct();
		String actualresult=hp.getTextFromCartButton();
		String expectedresult="6";
		
		//validation
		if(actualresult.equals(expectedresult))
		{
			System.out.println("TC pass");
		}
		
		else {
			
			System.out.println("TC fail");
		}
		
		driver.close();
		System.out.println("end program");
		
	}

}
