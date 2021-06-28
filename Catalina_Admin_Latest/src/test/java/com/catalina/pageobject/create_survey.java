package com.catalina.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class create_survey {
	WebDriver driver;

	WebDriver ldriver;

	public create_survey(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

}
	
	@FindBy(xpath = "//*[@id=\"menu\"]/li[2]/a")
	@CacheLookup
	public WebElement adminMenu;
	
	@FindBy(xpath = "//header[@class=\"mobile_view_only\"]//a[@class=\"dropdown-toggle\"]//span[@class=\"glyphicon sz-glyphicon fa fa-line-chart\"]")
	@CacheLookup
	public WebElement SurveyMenu;
	
	@FindBy(xpath = "//header[@class=\"mobile_view_only\"]//a[@id=\"addSurveyHide\"]")
	@CacheLookup
	public WebElement CreateSurveyMenu;
	
	@FindBy(xpath = "//h4[text()=\"Create a Survey\"]")
	@CacheLookup
	public WebElement page_title;
	
	@FindBy(xpath = "//input[@name=\"surveyname\"]")
	@CacheLookup
	public WebElement survey_name; 
	
	@FindBy(xpath = "//select[@ng-model=\"surveyData.surveyType\"]")
	@CacheLookup
	public WebElement survey_type;
	
	@FindBy(name = "effective")
	@CacheLookup
	public WebElement effective;
	
	@FindBy(xpath = "//select[@class=\"ui-datepicker-year\"]")
	@CacheLookup
	public WebElement effective_year;
	
	@FindBy(xpath = "//select[@class=\"ui-datepicker-month\"]")
	@CacheLookup
	public WebElement effective_month;
	
	@FindBy(xpath = "//table//tbody//tr[4]//td[1]")
	@CacheLookup
	public WebElement effective_date;
	
	@FindBy(name = "expiry")
	@CacheLookup
	public WebElement expiry_field;
	
	@FindBy(xpath = "//select[@class=\"ui-datepicker-year\"]")
	@CacheLookup
	public WebElement expiry_year;
	
	@FindBy(xpath = "//select[@class=\"ui-datepicker-month\"]")
	@CacheLookup
	public WebElement expiry_month;
	
	@FindBy(xpath = "//table//tbody//tr[4]//td[1]")
	@CacheLookup
	public WebElement expiry_date;
	
	@FindBy(name = "cutoff")
	@CacheLookup
	public WebElement survey_cutoff;
	
	@FindBy(xpath = "//button[text()=\"Save\"]")
	@CacheLookup
	public WebElement save;
	
	@FindBy(xpath = "//button[text()=\"Clear\"]")
	@CacheLookup
	public WebElement clear;
	
	@FindBy(xpath = "//button[text()=\"Cancel\"]")
	@CacheLookup
	public WebElement cancel;
	
	
	
	
	
	public void clickAdminMenu() {
		adminMenu.click();
	}
	
	public void SurveyMenu() {
		SurveyMenu.click();
	}
	
	public void CreateSurveyMenu() {
		CreateSurveyMenu.click();
	}
	
	public void set_survey_name(String SurveyName) {
		survey_name.sendKeys(SurveyName);
	}
	
	public void survey_type() {
		Select sel = new Select(survey_type);
		sel.selectByVisibleText("Service request survey");
	}
	
	public void effectivedate_field()
	{
		effective.click();
	}
	
	public void effective_year(String yr)
	{
		effective_year.sendKeys(yr);
	}
	
	public void effective_month(String mnt)
	{
		effective_month.sendKeys(mnt);
	}
	
	public void effective_date()
	{
		effective_date.click();
	}
	
	public void expiry_field()
	{
		expiry_field.click();
	}
	
	public void expiry_year(String yr)
	{
		expiry_year.sendKeys(yr);
	}
	
	public void expirye_month(String mnt)
	{
		expiry_month.sendKeys(mnt);
	}
	
	public void expiry_date()
	{
		expiry_date.click();
	}
	
	public void survey_cutoff(String cutoff) {
		survey_cutoff.sendKeys(cutoff);
	}
	
	public void save() {
		save.click();
	}
	
	public void clear() {
		clear.click();
	}
	
	public void cancel() {
		cancel.click();
	}
	
}
