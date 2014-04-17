package com.projectname.testcases;

import org.testng.annotations.Test;

import com.projectname.pages.LoginPage;

public class AT_Login_Invalid extends SuperTestNG
{
	@Test
	public void testAT_Login_Invalid()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("","");
		generic.explicitWait(2);
		loginPage.verifyErrMsg();
		
	}
}
