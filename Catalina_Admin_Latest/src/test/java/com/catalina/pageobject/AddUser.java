package com.catalina.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddUser {

	public static final String success_message = null;

	WebDriver driver;

	WebDriver ldriver;

	public AddUser(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"menu\"]/li[2]/a")
	@CacheLookup
	public WebElement adminMenu;

	@FindBy(xpath = "/html/body/header[2]/nav/div[2]/ul[1]/li[2]/ul/li[1]/a")
	@CacheLookup
	public WebElement userMenu;

	@FindBy(xpath = "/html/body/header[2]/nav/div[2]/ul[1]/li[2]/ul/li[1]/ul/li[1]/a")
	@CacheLookup
	public WebElement addUserMenu;
	
	@FindBy(how = How.NAME, using = "userName")
	@CacheLookup
	public WebElement userName;
	
	@FindBy(how = How.NAME, using = "firstName")
	@CacheLookup
	public WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	@CacheLookup
	public WebElement lastName;
	
	@FindBy(how = How.NAME, using = "middleName")
	@CacheLookup
	public WebElement middleName;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	public WebElement pwd;
	
	@FindBy(how = How.NAME, using = "email")
	@CacheLookup
	public WebElement email;
	
	@FindBy(how = How.NAME, using = "phoneNumber")
	@CacheLookup
	public WebElement phoneNumber;
	
	@FindBy(how = How.NAME, using = "workPhone")
	@CacheLookup
	public WebElement workPhone;
	
	@FindBy(how = How.NAME, using = "mobileNumber")
	@CacheLookup
	public WebElement mobileNumber;
	
	@FindBy(how = How.ID, using = "dateofbirth")
	@CacheLookup
	public WebElement dateofbirth;
	
	@FindBy(how = How.XPATH, using = "//select[@ng-options=\"item.groupName for item in groupName\"]")
	@CacheLookup
	public WebElement groupName;
	
	
	@FindBy(how = How.XPATH, using = "//select[@ng-options=\"item.detailDescription for item in status\"]")
	@CacheLookup
	public WebElement status;
	
	@FindBy(how = How.XPATH, using = "//select[@ng-options=\"emailverification as emailverification.detailCode for emailverification in statusForEmailverifyList track by emailverification.lookupDetailId\"]")
	@CacheLookup
	public WebElement emailVerified;
	
	
	@FindBy(how = How.XPATH, using = "//select[@ng-options=\"item as item.fsvName for item in fsv\"]")
	@CacheLookup
	public WebElement fsv;
	
	@FindBy(how = How.NAME, using = "employeeNumber")
	@CacheLookup
	public WebElement employeenumber;
	
	@FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
	@CacheLookup
	public WebElement add_button;
	
	@FindBy(how = How.XPATH, using = "//button[text()=\"Cancel\"]")
	@CacheLookup
	public WebElement cancel_button;
	  
	@FindBy(how = How.XPATH, using = "//span[text()=\" New user is added.\"]")
	@CacheLookup
	public WebElement addedsuccesmessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"register\"]/div/div[2]/button/span[1]")
	@CacheLookup
	public WebElement close_addedsuccesmessage;
	
	@FindBy(how = How.XPATH, using = "//span[text()=\"Please enter atleast any one of the field employee number/FSV\"]")
	@CacheLookup
	public WebElement adduser_errormsg_1;
	
	@FindBy(how = How.XPATH, using = "//span[text()=\"Username/Email is already used, please use different one \"]")
	@CacheLookup
	public WebElement adduser_errormsg_2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"register\"]/div/div[2]/button")
	@CacheLookup
	public WebElement close_adduser_errormsg_1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"register\"]/div/div[2]/button/span[1]")
	@CacheLookup
	public WebElement close_adduser_errormsg_2;
	
	
	@FindBy(how = How.XPATH, using = "//span[@ng-show=\"(registerUser.userName.$touched && (registerUser.userName.$error.pattern || registerUser.userName.$error.minlength))\"]")
	@CacheLookup
	public WebElement username_errormsg;
	
	@FindBy(how = How.XPATH, using = "//span[@ng-show=\"(registerUser.firstName.$touched && (registerUser.firstName.$error.pattern || registerUser.firstName.$error.minlength))\"]")
	@CacheLookup
	public WebElement firstname_errormsg;
	
	@FindBy(how = How.XPATH, using = "//span[@ng-show=\"(registerUser.lastName.$touched && (registerUser.lastName.$error.pattern || registerUser.lastName.$error.minlength))\"]")
	@CacheLookup
	public WebElement lastname_errormsg;
	
	@FindBy(how = How.XPATH, using = "//span[@ng-if=\"registerUser.password.$error.pattern\"]")
	@CacheLookup
	public WebElement password_errormsg;
	
	
	@FindBy(how = How.XPATH, using = "//span[@ng-show=\"registerUser.email.$dirty && registerUser.email.$error.pattern\"]")
	@CacheLookup
	public WebElement email_errormsg;
	
	
	
	

	public void clickAdminMenu() {
		adminMenu.click();
	}

	public void clickUserMenu() {
		userMenu.click();
	}

	public void clickAddUserMenu() {
		addUserMenu.click();
	}
	
	public void setUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	public void setFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void clearUserName() {
		userName.clear();
	}
	public void clearFirstName() {
		firstName.clear();
	}
	
	
	public void setLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void clearLastName() {
		lastName.clear();
	}
	
	public void setMiddleName(String mName) {
		middleName.sendKeys(mName);
	}
	
	public void clearMiddleName() {
		middleName.clear();
	}
	
	public void setPassword(String pw) {
		pwd.sendKeys(pw);
	}
	
	public void clearPassword() {
		pwd.clear();
	}
	
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void clearEmail() {
		email.clear();
	}
	
	public void setPhoneNumber(String pho) {
		phoneNumber.sendKeys(pho);
	
	}
	
	public void clearphoneNumber() {
		phoneNumber.clear();
	}

	public void setWorkPhone(String work) {
		workPhone.sendKeys(work);
	}
	
	public void clearworkPhone() {
		workPhone.clear();
	}
	
	public void setMobileNumber(String num) {
		mobileNumber.sendKeys(num);
	}
	
	public void clearmobileNumber() {
		mobileNumber.clear();
	}
	
	public void setDateofBirth(String birth) {
		dateofbirth.sendKeys(birth);
	}
	
	public void cleardateofbirth() {
		dateofbirth.clear();
	}
	
	public void setGroupName(String group) {
		groupName.sendKeys(group);
		
	}
	
	public void clearGroupName() {
		//groupName.clear();
		groupName.sendKeys("");
		
	}
	
	public void setStatus(String Status) {
		status.sendKeys(Status);
	}
	
	public void clearStatus() {
		status.clear();
		
	}
	
	public void EmailVerified(String verified) {
		emailVerified.sendKeys(verified);
	}
	
	public void clearEmailVerified() {
		emailVerified.clear();
	}
	
	public void fsv(String FSV) {
		fsv.sendKeys(FSV);
	}
	
	public void clearfsv() {
		fsv.clear();
	}
	
	public void employeenumber(String employee_num) {
		employeenumber.sendKeys(employee_num);
	}
	
	public void clear_employeenumber() {
		employeenumber.clear();
	}
	
	public void add_button() {
		add_button.click();
	}
	
	public void cancel_button() {
		cancel_button.click();
	}
	
	public void close_addedsuccesmessage()
	{
		close_addedsuccesmessage.click();
	}
	
	public void adduser_errormsg_1()
	{
		adduser_errormsg_1.click();
	}
	
	public void close_adduser_errormsg_1()
	{
		close_adduser_errormsg_1.click();
	}
	
	public void close_adduser_errormsg_2()
	{
		close_adduser_errormsg_2.click();
	}
	
	
}

