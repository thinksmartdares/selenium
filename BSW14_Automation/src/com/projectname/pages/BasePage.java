package com.projectname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage
{
	public WebDriver driver;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	@FindBy(xpath="//table[@class='menuTable']//td[1]/div")
	private WebElement settings;
	
	@FindBy(xpath="//a[text()='Billing Types']")
	private WebElement billingTypes;
	
	@FindBy(className="successmsg")
	private WebElement successMsg;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void logout()
	{
		logoutLink.click();
	}
	
	public void goToBillingType()
	{
		settings.click();
		billingTypes.click();
	}
	
	public void verifysuccessmsg(String eSmsg)
	{
		String aSmsg=successMsg.getText();
		Assert.assertEquals(aSmsg, eSmsg);
	}
}
