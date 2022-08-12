package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass {
	
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	private WebElement Selectbag;
	
	public void clickonbag()
	{
		Selectbag.click();
	
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocartbutton;
	
	public void clickonAddToCartButton()
	{
		addtocartbutton.click();
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement addtocartsymbol;
	
	//for single product
	
	public String getTextFromCartButton()
	{
		String totalproduct=addtocartsymbol.getText();
		return totalproduct;
	}
	
	//for multiple product
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> multipleaddtocart;
	
	public void clickAllProduct()
	
	
	{
		
		for(WebElement a:multipleaddtocart)
		{
			
			a.click();
		}	
		

	}
	
	//drop down filter
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement dropdownFilter;
	
	public String clickOnDropDownFilter()
	{
		dropdownFilter.click();
		s.selectByVisibleText("Price (low to high)");
		String dropdowntext=dropdownFilter.getText();
		return dropdowntext;
		
	}
	
	//setting button
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement settingbutton;
	
	public void clickonsettingbutton()
	{
		settingbutton.click();
	}
	
	//Logoutbutton
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement Logoutbutton;
	
	public void clickLogoutbutton()
	{
		Logoutbutton.click();
	}
	
	
	

	
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		s=new Select(dropdownFilter);
	}
	

}
