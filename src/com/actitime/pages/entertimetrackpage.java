package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class entertimetrackpage extends BasePage
{
	@FindBy(id="logoutLink")
	private WebElement logouttb;

	public entertimetrackpage(WebDriver driver)
	{
	super(driver);
	PageFactory.initElements(driver, this);
	
	}
	public void clickonlogout()
	{
	 logouttb.click();	
	}
	



}
