package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public WebDriver driver;
  @BeforeMethod
  public void precondition() throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://demo.actitime.com/login.do");
	 Thread.sleep(1000);
	 
  }
  @AfterMethod
  public void postcondition()
  {
	driver.close();
  }
}
