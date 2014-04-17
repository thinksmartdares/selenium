package com.projectname.testcases;

import org.testng.annotations.Test;

import com.projectname.pages.BasePage;
import com.projectname.pages.BillingTypesPage;
import com.projectname.pages.LoginPage;
import com.projectname.pages.NewBillingTypePage;

public class AT_Billing_Create extends SuperTestNG
{
	@Test
	public void testAT_Billing_Create()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("admin","manager");
		
		BasePage basePage=new BasePage(driver);
		basePage.goToBillingType();
		
		BillingTypesPage btPage=new BillingTypesPage(driver);
		btPage.clickCreateBillingType();
		
		NewBillingTypePage nbtPage=new NewBillingTypePage(driver);
		nbtPage.createBillingType("Contract");
		
		basePage.verifysuccessmsg("Billing type has been successfully created.");
		
		basePage.logout();
		
	}
}
