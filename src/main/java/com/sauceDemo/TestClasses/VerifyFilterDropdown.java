package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.HomePagePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;

public class VerifyFilterDropdown {
	
	public static void main(String[] args) {
		
		//open browser and pass url
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
		String actualresult=hp.clickOnDropDownFilter();
		String expectedresult="PRICE (LOW TO HIGH)";
		
		//validation
		if(actualresult.equals(expectedresult))
		{
			System.out.println("TC pass");
		}	
		
		else
		{
			System.out.println("TC fail");
		}
		
	}

}
