package com.projectname.libraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Generic
{
	public void verifyTitle(WebDriver driver,String eTitle)
	{
		String aTitle=driver.getTitle();
		Assert.assertEquals(aTitle,eTitle);
	}
	public void explicitWait(int durationInSec)
	{
		try {
			Thread.sleep(1000*durationInSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
