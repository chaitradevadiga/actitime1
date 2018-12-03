package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.eceldata;
import com.actitime.pages.Loginpage;

public class verifyversionTest extends BaseTest
{
@Test
public void testverifyversion() throws InterruptedException
{
	String loginTitle=eceldata.getData("./data/actitime.xlsx", "Sheet1", 1, 2);
	Loginpage lp=new Loginpage(driver);
	lp.verifytheTitle(loginTitle);
	Thread.sleep(10000);
	lp.verifytheversion();
	Thread.sleep(10000);
}
}
