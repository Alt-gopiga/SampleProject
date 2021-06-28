package com.catalina.tetcases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.InputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.catalina.model.AddUserModel;
import com.catalina.pageobject.AddUser;
import com.catalina.pageobject.LoginPage;
import com.catalina.utilities.Reporting;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TC_AddUser extends BaseClass {
	Reporting rp = new Reporting();

	@Test(priority = 1)
	public void login() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);

		Thread.sleep(3000);

		lp.setUseName(username);
		logger.info("username passed");
		lp.setPassword(password);
		logger.info("password paased");

		lp.clicklogin();
		Thread.sleep(5000);
		// AddUser addUser = new AddUser(driver);
	}

	@Test(priority = 2)
	public void navigateToAddUser() throws InterruptedException {
		AddUser addUser = new AddUser(driver);

		addUser.clickAdminMenu();
		addUser.clickUserMenu();
		addUser.clickAddUserMenu();
		logger.info("Navigated into add user page.\r\n");
		Thread.sleep(3000);
	}

	@Test(priority = 3, dataProvider = "AddUserData")
	public void addUser(AddUserModel model) throws InterruptedException {
		logger.info("Add User process started.\r\n");
		logger.info("Test Case Name : "+model.getTestName()+".\r\n");
		AddUser addUser = new AddUser(driver);

		Thread.sleep(3000);

		addUser.setUserName(model.getUserName());
		logger.info("username =" + model.getUserName());
		addUser.setFirstName(model.getFirstName());
		logger.info("firstname = " + model.getFirstName());
		addUser.setLastName(model.getLastName());
		logger.info("lastname = " + model.getLastName());
		addUser.setMiddleName(model.getMiddleName());
		logger.info("middlename = " + model.getMiddleName());
		addUser.setPassword(model.getPassword());
		logger.info("password = " + model.getPassword());
		addUser.setEmail(model.getEmail());
		logger.info("email = " + model.getEmail());
		addUser.setPhoneNumber(model.getPhoneNumber());
		logger.info("phonenumber = " + model.getPhoneNumber());
		addUser.setWorkPhone(model.getWorkPhone());
		logger.info("workphone = " + model.getWorkPhone());
		addUser.setMobileNumber(model.getMobileNumber());
		logger.info("mobilenumber = " + model.getMobileNumber());
		// addUser.setDateofBirth(model.getDateofbirth());
		Thread.sleep(1000);
		addUser.setGroupName(model.getGroupName());
		logger.info("groupname = " + model.getGroupName());
		addUser.setStatus(model.getStatus());
		logger.info("status = " + model.getStatus());
		addUser.EmailVerified(model.getEmailVerified());
		logger.info("emailverified = " + model.getEmailVerified());
		addUser.fsv(model.getfsv());
		logger.info("fsv = " + model.getfsv());
		addUser.employeenumber(model.getemployeenumber());
		logger.info("employeenumber = " + model.getemployeenumber());


		if (addUser.add_button.isDisplayed()) {
			addUser.add_button();
			logger.info("Add button clicked.\r\n");

			Thread.sleep(10000);
			try {
				if (addUser.addedsuccesmessage.isDisplayed()) {
					String success_message = addUser.addedsuccesmessage.getText();
					logger.info("Message after adding user =.\r\n" + " " + " " + success_message);
					addUser.close_addedsuccesmessage();
					assertEquals(addUser.addedsuccesmessage.isDisplayed(), model.isExpected());
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			try {
				if (addUser.adduser_errormsg_1.isDisplayed()) {
					String error_message = addUser.adduser_errormsg_1.getText();
					captureScreen(driver, "error 1");
					logger.info("error_message .\r\n" + "" + "" + error_message);
					addUser.close_adduser_errormsg_1();
					assertEquals(addUser.adduser_errormsg_1.isDisplayed(), model.isExpected());
				}

			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				if (addUser.adduser_errormsg_2.isDisplayed()) {
					String error_message = addUser.adduser_errormsg_2.getText();
					captureScreen(driver, "error 2");
					logger.info("error_message .\r\n" + "" + "" + error_message);
					addUser.close_adduser_errormsg_2();
					assertEquals(addUser.adduser_errormsg_2.isDisplayed(), model.isExpected());
				}
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				if (addUser.username_errormsg.isDisplayed()) {
					String error_message = addUser.username_errormsg.getText();
					captureScreen(driver, "username error");
					logger.info("error_message .\r\n" + "" + "" + error_message);
					assertEquals(addUser.username_errormsg.isDisplayed(), model.isExpected());
				}
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				if (addUser.firstname_errormsg.isDisplayed()) {
					String error_message = addUser.firstname_errormsg.getText();
					captureScreen(driver, "firstname error");
					logger.info("error_message .\r\n" + "" + "" + error_message);
					assertEquals(addUser.firstname_errormsg.isDisplayed(), model.isExpected());
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			try {
				if (addUser.lastname_errormsg.isDisplayed()) {
					String error_message = addUser.lastname_errormsg.getText();
					captureScreen(driver, "lastname error");
					logger.info("error_message .\r\n" + "" + "" + error_message);
					assertEquals(addUser.lastname_errormsg.isDisplayed(), model.isExpected());
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			try {
				if (addUser.password_errormsg.isDisplayed()) {
					String error_message = addUser.password_errormsg.getText();
					captureScreen(driver, "password error");
					logger.info("error_message .\r\n" + "" + "" + error_message);
					addUser.close_adduser_errormsg_2();
					assertEquals(addUser.password_errormsg.isDisplayed(), model.isExpected());
				}
			} catch (Exception e) {
				System.out.println(e);
			}

			try {
				if (addUser.email_errormsg.isDisplayed()) {
					String error_message = addUser.email_errormsg.getText();
					captureScreen(driver, "email error");
					logger.info("error_message .\r\n" + "" + "" + error_message);
					assertEquals(addUser.email_errormsg.isDisplayed(), model.isExpected());
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		Thread.sleep(5000);

		addUser.clearUserName();
		addUser.clearFirstName();
		addUser.clearLastName();
		addUser.clearMiddleName();
		addUser.clearPassword();
		addUser.clearEmail();
		addUser.clearphoneNumber();
		addUser.clearworkPhone();
		addUser.clearmobileNumber();
		addUser.clear_employeenumber();

	}

	@DataProvider(name = "AddUserData")
	public AddUserModel[] getData() {
		AddUserModel[] addUserModelArr = null;
		try (InputStream input = new FileInputStream("src/test/resources/data/add-user.json");) {
			ObjectMapper objectMapper = new ObjectMapper();

			addUserModelArr = objectMapper.readValue(input, AddUserModel[].class);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return addUserModelArr;
	}

}
