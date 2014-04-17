package com.projectname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewBillingTypePage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(id="name")
	private WebElement nameTextBox;
	
	@FindBy(xpath="//input[contains(@value,'Create Billing Type')]")
	private WebElement createBillingButton;
	
	public NewBillingTypePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void createBillingType(String billingName)
	{
		nameTextBox.sendKeys(billingName);
		createBillingButton.click();
	}
}
