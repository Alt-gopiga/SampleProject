package com.catalina.tetcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.catalina.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{


	@Test
	public void logintest() throws IOException 
	{
		
		
		logger.info("opened browser url");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LoginPage lp = new LoginPage(driver);
		
		if(lp.title.isDisplayed())
		{
			Assert.assertTrue(true);
			
			lp.setUseName(username);
			logger.info("username passed");
			lp.setPassword(password);
			logger.info("password paased");
			lp.clicklogin();
			logger.info("login button cliked");
			
		}else
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
		}
	}
	
	
}
