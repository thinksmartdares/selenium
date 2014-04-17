package com.projectname.testcases;

import org.testng.annotations.Test;
import com.projectname.pages.BasePage;
import com.projectname.pages.LoginPage;

public class AT_Login_Valid extends SuperTestNG
{
	@Test
	public void testAT_Login_Valid()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("admin","manager");
		
		generic.explicitWait(3);
		generic.verifyTitle(driver,"actiTIME - Enter Time-Track");
		
		BasePage basePage=new BasePage(driver);
		basePage.logout();
		
		generic.verifyTitle(driver,"actiTIME - Login");
	}
}
