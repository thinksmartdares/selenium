package com.projectname.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingTypesPage extends BasePage
{
	public WebDriver driver;
	
	
	@FindBy(xpath="//span[text()='Create Billing Type']")
	private WebElement createBillingType;
	
	
	public BillingTypesPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickCreateBillingType()
	{
		createBillingType.click();
	}
	
	public void deleteBillingType(String billingType)
	{
		String xPath="//tr[td[a[text()='"+billingType+"']]]//a[contains(text(),'delete')]";
		driver.findElement(By.xpath(xPath)).click();
		driver.switchTo().alert().accept();
		
	}
}
