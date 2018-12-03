package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
public WebDriver driver;
public BasePage(WebDriver driver)
{
	this.driver=driver;
}
public void verifytitle(String etitle)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try
	{
		wait.until(ExpectedConditions.titleIs(etitle));	
		Reporter.log("title is matching", true);
	}
	catch(Exception e)
	{
		Reporter.log("title is not matching",true);
		Assert.fail();
	}
	
}
public void verifyelement(WebElement element)
{
 WebDriverWait wait=new WebDriverWait(driver,10);
 try
 {
	wait.until(ExpectedConditions.visibilityOf(element));
	 Reporter.log("element is present", true);
 }
 catch(Exception e)
 {
	Reporter.log("element is not present", true); 
	 Assert.fail();
 }
 }

}