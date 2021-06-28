package com.catalina.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchUser {
	WebDriver driver;

	WebDriver ldriver;

	public SearchUser(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

}
	
	@FindBy(xpath = "//*[@id=\"menu\"]/li[2]/a")
	@CacheLookup
	public WebElement adminMenu;
	
	@FindBy(xpath = "/html/body/header[2]/nav/div[2]/ul[1]/li[2]/ul/li[1]/a")
	@CacheLookup
	public WebElement userMenu;
	
	
	@FindBy(xpath = "/html/body/header[2]/nav/div[2]/ul[1]/li[2]/ul/li[1]/ul/li[2]/a")
	@CacheLookup
	public WebElement searchUser;
	
	@FindBy(how = How.NAME, using = "firstName")
	@CacheLookup
	public WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	@CacheLookup
	public WebElement lastName;
	
	
	@FindBy(how = How.NAME, using = "phoneNumber")
	@CacheLookup
	public WebElement phoneNumber;
	

	
	@FindBy(xpath = "//*[@id=\"view\"]/div[2]/section/div[1]/div[2]/div/div/form/div/div[5]/select")
	@CacheLookup
	public WebElement status;
	
	@FindBy(xpath = "//*[@id=\"view\"]/div[2]/section/div[1]/div[2]/div/div/form/div/div[6]/select")
	@CacheLookup
	public WebElement FSV;
	
	@FindBy(how = How.XPATH, using = "//button[text()=\"Search\"]")
	@CacheLookup
	public WebElement searchButton;
	
	@FindBy(how = How.NAME, using = "//button[text()=\"Clear\"]")
	@CacheLookup
	public WebElement clear;
	
	@FindBy(how = How.XPATH, using = "//div[@ng-show = \"isUsers\"]")
	@CacheLookup
	public WebElement userList;
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickAdminMenu() {
		adminMenu.click();
	}

	public void clickUserMenu() {
		userMenu.click();
	}
	
	public void clickSearchuser() {
		searchUser.click();
	}

	public void setFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void setLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void setPhoneNumber(String pho) {
		phoneNumber.sendKeys(pho);
	}
	
	public void setstatus(String stu) {
		status.sendKeys(stu);
	}
	
	public void setselect(String f) {
		FSV.sendKeys(f);
	}
	
	public void clicksearch() {
		searchButton.click();
	}
	
	public void clickclear() {
		clear.click();
		
	}
	
}
	
