package com.catalina.tetcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.catalina.pageobject.LoginPage;
import com.catalina.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUseName(user);
		logger.info("username name provider");
		lp.setPassword(pwd);
		logger.info("password name provider");
		lp.clicklogin();
		logger.info("login clicked");
		
		
		Thread.sleep(3000);
		try {
			if (lp.Admin_dropdown.isDisplayed()) 
			{
				lp.clicklogout();
			}
			else if (lp.errormsg1.isDisplayed()) {
				lp.close_errormsg1();
			}
			else if (lp.errormsg2.isDisplayed()) {
				lp.close_errormsg2();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	 public boolean isAlertPresent()//user defined method create to check alert is present or not
	 {
		 try
		 {
			 driver.switchTo().alert();
			 return true;
		 }
		 catch(NoAlertPresentException e)
		 {
			 return false;
		 }
	 }
	
	@DataProvider(name = "LoginData")
	String [][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/catalina/testdata/login_excel.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "login");
		int colcount = XLUtils.getCellCount(path, "login", 1);
		
		String logindata[][] = new String [rownum][colcount];
		
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "login", i, j);
			}
		}
		return logindata;
		
	}

}
