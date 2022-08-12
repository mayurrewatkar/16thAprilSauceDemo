package com.sauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass {
	
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		
		//date and time format cod
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		
		String date=d1.format(d);
		
		//screen shot code
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshot Folder/SauceDemoPP"+date+".jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("Screenshot taken");
		
	}
}
