package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.eceldata;
import com.actitime.pages.Loginpage;
import com.actitime.pages.entertimetrackpage;

public class validloginlogouttest extends BaseTest
{
@Test
public void testvalidloginlogout() throws InterruptedException
{
	String user=eceldata.getData("./data/actitime.xlsx", "Sheet1", 1, 0);
	String pass=eceldata.getData("./data/actitime.xlsx", "Sheet1", 1, 1);
	String logintitle=eceldata.getData("./data/actitime.xlsx", "Sheet1", 1, 2);
	String entertimetrack=eceldata.getData("./data/actitime.xlsx", "Sheet1", 1, 3);
	Loginpage lp=new Loginpage(driver);
	entertimetrackpage ep=new entertimetrackpage(driver);
	lp.verifytheTitle(logintitle);
	Thread.sleep(10000);
	lp.enterUserName(user);
	Thread.sleep(10000);
	lp.enterPassName(pass);
	Thread.sleep(10000);
	lp.clickonlogin();
	Thread.sleep(10000);
	//lp.verifytitle(logintitle);
	ep.verifytitle(entertimetrack);
	Thread.sleep(10000);
	ep.clickonlogout();	
}
}
