package com.catalina.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFsv {
	WebDriver driver;

	WebDriver ldriver;

	public AddFsv(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//header[@class=\"mobile_view_only\"]//li[@class=\"dropdown \"]//a[@class=\"fs_li_admin ul_head_admin height_50\"]")
	@CacheLookup
	public WebElement admin_menu;
	
	@FindBy(xpath = "//header[@class=\"mobile_view_only\"]//li[@id=\"fsvHide\"]")
	@CacheLookup
	public WebElement fsv_menu;
	
	@FindBy(xpath = "//header[@class=\"mobile_view_only\"]//a[@id=\"addFsvHide\"]")
	@CacheLookup
	public WebElement addfsv_menu;
	
	@FindBy(xpath = "//h5[text()=\"Add Field Service Vendor Registration (FSV)\"]")
	@CacheLookup
	public WebElement addfsv_header;
	
	@FindBy(name  = "fsvname")
	@CacheLookup
	public WebElement Fsv_Name;
	
	@FindBy(name  = "fsvEin")
	@CacheLookup
	public WebElement fsvEin;
	
	@FindBy(xpath  = "//input[@ng-model=\"fsvdata.address.addressLine1\"]")
	@CacheLookup
	public WebElement addressLine;
	
	@FindBy(name  = "city")
	@CacheLookup
	public WebElement city;
	
	@FindBy(name  = "country")
	@CacheLookup
	public WebElement country;
	
	@FindBy(name  = "state")
	@CacheLookup
	public WebElement state;
	
	@FindBy(name  = "zipcode")
	@CacheLookup
	public WebElement zipcode;
	
	@FindBy(name  = "fsvContactPerson")
	@CacheLookup
	public WebElement fsvContactPerson;
	
	@FindBy(name  = "phoneNumber")
	@CacheLookup
	public WebElement phoneNumber;
	
	@FindBy(name  = "email")
	@CacheLookup
	public WebElement email;
	
	@FindBy(xpath  = "//select[@ng-model=\"fsvdata.fsvStatus\"]")
	@CacheLookup
	public WebElement status;
	
	@FindBy(xpath  = "//button[@type=\"submit\"]")
	@CacheLookup
	public WebElement add_button;
	
	@FindBy(xpath  = "//button[text()=\"Cancel\"]")
	@CacheLookup
	public WebElement cancel_button;
	
	
	@FindBy(xpath  = "//strong[text()=\"Added successfully\"]")
	@CacheLookup
	public WebElement add_succ_msg;
	
	@FindBy(xpath  = "//button[@class=\"close\"]")
	@CacheLookup
	public WebElement close_add_succ_msg;
	
	@FindBy(xpath  = "//span[@ng-show=\"(fsv.fsvname.$touched && ( fsv.fsvname.$error.minlength))\"]")
	@CacheLookup
	public WebElement fsvName_error;
	
	@FindBy(xpath  = "//span[@ng-show=\"fsv.zipcode.$error.pattern ||fsv.zipcode.$error.minlength\"]")
	@CacheLookup
	public WebElement ZipCode_error;
	
	@FindBy(xpath  = "//span[@ng-show=\"fsv.email.$dirty && fsv.email.$error.pattern\"]")
	@CacheLookup
	public WebElement Email_error;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void adminmenu() {
		admin_menu.click();
	}
	
	
	public void fsvmenu() {
		fsv_menu.click();
	}
	public void addfsvmenu() {
		addfsv_menu.click();
	}
	
	public void set_fsvname(String fsvname) {
		Fsv_Name.sendKeys(fsvname);
	}
	public void clear_fsvname() {
		Fsv_Name.clear();
	}
	
	public void set_ein(String ein) {
		this.fsvEin.sendKeys(ein);
	}
	public void clear_ein() {
		fsvEin.clear();
	}
	
	public void set_address(String add) {
		addressLine.sendKeys(add);
	}
	public void clear_address() {
		addressLine.clear();
	}
	
	public void set_city(String CITY) {
		city.sendKeys(CITY);
	}
	public void clear_city() {
		city.clear();
	}
	
	public void set_country(String Country) {
		country.sendKeys(Country);
	}
	public void clear_country() {
		country.clear();
	}
	
	public void set_state(String State) {
		state.sendKeys(State);
	}
	public void clear_state() {
		state.clear();
	}
	
	public void set_zipcode(String Zip) {
		zipcode.sendKeys(Zip);
	}
	public void clear_zipcode() {
		zipcode.clear();
	}
	
	public void set_contactpersion(String Contactpersion) {
		fsvContactPerson.sendKeys(Contactpersion);
	}
	public void clear_contactpersion() {
		fsvContactPerson.clear();
	}
	
	public void set_phonenumber(String Phone) {
		phoneNumber.sendKeys(Phone);
	}
	public void clear_phonenumber() {
		phoneNumber.clear();
	}
	
	public void set_email(String mail) {
		email.sendKeys(mail);
	}
	public void clear_email() {
		email.clear();
	}
	
	public void set_status(String Status) {
		status.sendKeys(Status);
	}
	public void clear_status() {
		status.clear();
	}
	
	public void add_button() {
		add_button.click();
	}
	
	public void cancel_button() {
		cancel_button.click();
	}
	
	public void close_add_succ_msg() {
		close_add_succ_msg.click();
	}

}
