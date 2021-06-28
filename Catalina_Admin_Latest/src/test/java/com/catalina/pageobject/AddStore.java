package com.catalina.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddStore {
	WebDriver driver;

	WebDriver ldriver;

	public AddStore(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//header[@class=\"mobile_view_only\"]//li[@class=\"dropdown \"]//a[@class=\"fs_li_admin ul_head_admin height_50\"]")
	@CacheLookup
	public WebElement admin_menu;
	
	@FindBy(xpath = "//header[@class=\"mobile_view_only\"]//li[@id=\"storeHide\"]//a[@class=\"dropdown-toggle\"]")
	@CacheLookup
	public WebElement store_menu;
	
	@FindBy(xpath = "//header[@class=\"mobile_view_only\"]//li[@id=\"storeHide\"]//a[@id=\"addStoreHide\"]")
	@CacheLookup
	public WebElement addstore_menu;
	
	@FindBy(xpath = "//h5[text()=\"Add Store\"]")
	@CacheLookup
	public WebElement addstore_text;
	
	@FindBy(name = "storename")
	@CacheLookup
	public WebElement store_name;
	
	@FindBy(name = "storeEin")
	@CacheLookup
	public WebElement store_ein;
	
	@FindBy(xpath = "//input[@uib-tooltip=\"Address Line 1\"]")
	@CacheLookup
	public WebElement store_address;
	
	@FindBy(name = "city")
	@CacheLookup
	public WebElement city;
	
	@FindBy(name = "country")
	@CacheLookup
	public WebElement country;
	
	@FindBy(name = "state")
	@CacheLookup
	public WebElement state;
	
	@FindBy(name = "zipcode")
	@CacheLookup
	public WebElement zipcode;
	
	@FindBy(xpath = "//select[@ng-model=\"storedata.storeChain\"]")
	@CacheLookup
	public WebElement chain;
	
	@FindBy(name = "phoneNumber")
	@CacheLookup
	public WebElement phonenumber;
	
	@FindBy(name = "email")
	@CacheLookup
	public WebElement email;
	
	@FindBy(name = "storeContactPerson")
	@CacheLookup
	public WebElement contact_persion;
	
	@FindBy(name = "storeNumber")
	@CacheLookup
	public WebElement store_number;
	
	@FindBy(xpath = "//select[@ng-model=\"storedata.storeStatus\"]")
	@CacheLookup
	public WebElement status;
	
	@FindBy(xpath = "//div[@class=\"text-center\"]//button[@type=\"submit\"]")
	@CacheLookup
	public WebElement add_btn;
	
	@FindBy(xpath = "//button[text()=\"Cancel\"]")
	@CacheLookup
	public WebElement cancel_btn;
	
	@FindBy(xpath = "//strong[text()=\"Added successfully\"]")
	@CacheLookup
	public WebElement Add_success_msg;
	
	@FindBy(xpath = "//span[@ng-show=\"(store.storename.$touched && (store.storename.$error.minlength))\"]")
	@CacheLookup
	public WebElement error_storename;
	
	@FindBy(xpath = "//span[@aria-hidden=\"false\"]")
	@CacheLookup
	public WebElement error_zipcode;
	
	@FindBy(xpath = "//span[@ng-show=\"store.email.$dirty && store.email.$error.pattern\"]")
	@CacheLookup
	public WebElement error_email;
	
	@FindBy(xpath = "//span[@ng-show=\"store.storeNumber.$touched && store.storeNumber.$error.pattern\"]")
	@CacheLookup
	public WebElement error_storeNumber;
	
	
	public void adminmenu() {
		admin_menu.click();
	}
	
	public void storemenu() {
		store_menu.click();
	}
	
	public void addstoremenu() {
		addstore_menu.click();
	}
	
	
	public void set_storeName(String storename) {
		store_name.sendKeys(storename);
	}
	
	public void set_storeEin(String ein) {
		store_ein.sendKeys(ein);
	}
	
	public void set_storeaddress(String address) {
		store_address.sendKeys(address);
	}
	
	public void set_City(String City) {
		city.sendKeys(City);
	}
	
	public void set_country(String Country) {
		country.sendKeys(Country);
	}
	
	public void set_state(String State) {
		state.sendKeys(State);
	}
	
	public void set_ZipCode(String Zip) {
		zipcode.sendKeys(Zip);
	}
	
	public void set_Chain(String Chain) {
		chain.sendKeys(Chain);
	}
	
	public void set_PhoneNumber(String phone) {
		phonenumber.sendKeys(phone);
	}
	
	public void set_Email(String mail) {
		email.sendKeys(mail);
	}
	
	public void set_ContactPersion(String persion) {
		contact_persion.sendKeys(persion);
	}
	
	public void set_StoreNumber(String storenum) {
		store_number.sendKeys(storenum);
	}
	
	public void set_Status(String Status) {
		status.sendKeys(Status);
	}
	
	public void Addbutton() {
		add_btn.click();
	}
	
	public void Add_success_msg() {
		Add_success_msg.click();
	}
	
	public void error_storename() {
		error_storename.click();
	}
	
	public void error_zipcode() {
		error_zipcode.click();
	}
	
	public void error_email() {
		error_email.click();
	}
	
	public void error_storeNumber() {
		error_storeNumber.click();
	}
	
	
}
