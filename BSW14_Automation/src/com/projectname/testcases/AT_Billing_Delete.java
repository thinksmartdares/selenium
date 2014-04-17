package com.projectname.testcases;

import org.testng.annotations.Test;

import com.projectname.pages.BasePage;
import com.projectname.pages.BillingTypesPage;
import com.projectname.pages.LoginPage;

public class AT_Billing_Delete extends SuperTestNG 
{
	@Test
	public void testAT_Billing_Delete()
	{
		new LoginPage(driver).login("admin","manager");
		BasePage basePage=new BasePage(driver);
		basePage.goToBillingType();
		BillingTypesPage btPage=new BillingTypesPage(driver);
		btPage.deleteBillingType("Contract");
		basePage.verifysuccessmsg("Billing type has been successfully deleted.");
		basePage.logout();
		
		
	}
}
