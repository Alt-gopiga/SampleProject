package com.catalina.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver ;
	
	WebDriver ldriver;
	 public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	 @FindBy(xpath = " //div//h2")
	 @CacheLookup
	 public WebElement title;
	
	@FindBy(id = "email")
	@CacheLookup
	public WebElement txtUserName;
	
	@FindBy(id  = "pwd")
	@CacheLookup
	public WebElement txtPassword;
	
	@FindBy(xpath  = "//button[text()=\"Login\"]")
	@CacheLookup
	public WebElement Login_btn ;
	
	@FindBy(xpath  = "//*[text()=\" PLEASE CHECK YOUR LOGIN CREDENTIALS!!\"]")
	@CacheLookup
	public WebElement errormsg1 ;
	
	@FindBy(xpath  = "//span[@class=\"close\"]")
	@CacheLookup
	public WebElement close_errormsg1 ;
	
	@FindBy(xpath  = "//*[text()=\" ACCOUNT IS NOT YET ACTIVATED\"]")
	@CacheLookup
	public WebElement errormsg2 ;
	
	@FindBy(xpath  = "//span[@class=\"close\"]")
	@CacheLookup
	public WebElement close_errormsg2 ;
	
	
	@FindBy(xpath  = "//header[@class=\"mobile_view_only\"]//li[@class=\"dropdown \"]//a[@class=\"fs_li_admin ul_head_admin height_50\"]")
	@CacheLookup
	public WebElement Admin_dropdown ;
	
	@FindBy(xpath  = "//header[@class=\"mobile_view_only\"]//*[text()=\" Logout \"]")
	@CacheLookup
	public WebElement Logout_btn ;
	
	
	
	
	public void setUseName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		Login_btn.click();
	}
	
	public void errormsg1()
	{
		errormsg1.click();
	}
	
	public void close_errormsg1()
	{
		close_errormsg1.click();
	}
	
	public void errormsg2()
	{
		errormsg2.click();
	}
	
	public void close_errormsg2()
	{
		close_errormsg2.click();
	}
	
	public void Admin_dropdown()
	{
		Admin_dropdown.click();
	}
	
	public void clicklogout()
	{
		Logout_btn.click();
	}
	
	

	
	
	
}
