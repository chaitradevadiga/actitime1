package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class Loginpage extends BasePage
{
 @FindBy(id="username")
 private WebElement untb;
 @FindBy(name="pwd")
 private WebElement pswtb;
 @FindBy(xpath="//div[.='Login ']")
 private WebElement logintb;
 @FindBy(xpath="//nobr[Contains(text(),'actiTime')]")
 private WebElement version;
 
 public Loginpage(WebDriver driver)
 {
	 super(driver);
	 PageFactory.initElements(driver,this);
 }

public void enterUserName(String un)
{
	untb.sendKeys(un);
}
public void enterPassName(String pw)
{
	pswtb.sendKeys(pw);
}
public void clickonlogin()
{
	logintb.click();
}
public void verifytheTitle(String etitle)
{
	verifytitle(etitle);
}
public void verifytheversion()
{
	verifyelement(version);
	
}
 
}
