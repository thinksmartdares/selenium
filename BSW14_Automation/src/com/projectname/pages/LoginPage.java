package com.projectname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage
{
	public WebDriver driver;
	
	@FindBy(name="username")
	private WebElement unTextBox;
	
	@FindBy(name="pwd")
	private WebElement pwdTextBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(className="errormsg")
	private WebElement errMsgElement;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void login(String un,String pwd)
	{
		unTextBox.sendKeys(un);
		pwdTextBox.sendKeys(pwd);
		loginButton.click();
	}
	
	public void verifyErrMsg()
	{
		String aErrMsg=errMsgElement.getText();
		String eErrMsg="Username or Password is invalid. Please try again.";
		Assert.assertEquals(aErrMsg, eErrMsg);
	}

}
