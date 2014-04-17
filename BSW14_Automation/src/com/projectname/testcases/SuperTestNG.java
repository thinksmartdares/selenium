package com.projectname.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.projectname.libraries.Generic;

public class SuperTestNG
{	public WebDriver driver;
	public Generic generic;
	@BeforeMethod
	public void preCondtion()
	{
		generic=new Generic();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void postCondtion()
	{
		driver.quit();
	}
}
