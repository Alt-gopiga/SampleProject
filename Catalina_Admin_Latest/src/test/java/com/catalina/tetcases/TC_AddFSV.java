package com.catalina.tetcases;

import java.io.FileInputStream;
import java.io.InputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.catalina.model.AddFsvModel;
import com.catalina.pageobject.AddFsv;
import com.catalina.pageobject.LoginPage;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TC_AddFSV extends BaseClass {

	@Test(priority = 1)
	public void login() throws InterruptedException {

		Thread.sleep(3000);
		LoginPage lp = new LoginPage(driver);
		lp.setUseName(username);
		logger.info("username passed");
		lp.setPassword(password);
		logger.info("password paased");
		lp.clicklogin();
		Thread.sleep(5000);
		logger.info("Login into the website");
	}

	@Test(priority = 2)
	public void NavigateToAddFsv() throws InterruptedException {
		AddFsv addfsv = new AddFsv(driver);
		Thread.sleep(2000);

		addfsv.adminmenu();
		addfsv.fsvmenu();
		addfsv.addfsvmenu();

		Thread.sleep(3000);
		logger.info("Navigated into AddFSV menu");
	}

	@Test(priority = 3, dataProvider = "AddFsvData")
	public void addfsv(AddFsvModel model) throws InterruptedException

	{
		Thread.sleep(3000);
		logger.info("Add Fsv process started");
		logger.info("Test Case Name : "+model.getTestName()+".\r\n");
		AddFsv addfsv = new AddFsv(driver);

		addfsv.set_fsvname(model.getfsvname());
		addfsv.set_ein(model.getein());
		addfsv.set_address(model.getaddress());
		addfsv.set_city(model.getcity());
		addfsv.set_country(model.getcountry());
		Thread.sleep(2000);
		addfsv.set_state(model.getstate());
		addfsv.set_zipcode(model.getzip());
		addfsv.set_contactpersion(model.getcontactpersion());
		addfsv.set_phonenumber(model.getphonenumber());
		addfsv.set_email(model.getcontactemail());
		addfsv.set_status(model.getstatus());

		Thread.sleep(1000);

		try {

			if (addfsv.add_button.isDisplayed()) {
				addfsv.add_button();

				Thread.sleep(3000);
				try {

					if (addfsv.add_succ_msg.isDisplayed()) {
						String succ_message = addfsv.add_succ_msg.getText();
						logger.info("Message after adding FSV =" + " " + " " + succ_message + ".\r\n");
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					if (addfsv.Email_error.isDisplayed()) {
						String Email_error = addfsv.Email_error.getText();
						logger.info("Message after adding FSV =" + " " + " " + Email_error + ".\r\n");
						driver.navigate().refresh();
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					if (addfsv.fsvName_error.isDisplayed()) {
						String fsvName_error = addfsv.fsvName_error.getText();
						logger.info("Message after adding FSV =" + " " + " " + fsvName_error + ".\r\n");
						driver.navigate().refresh();
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					if (addfsv.ZipCode_error.isDisplayed()) {
						String ZipCode_error = addfsv.ZipCode_error.getText();
						logger.info("Message after adding FSV =" + " " + " " + ZipCode_error + ".\r\n");
						driver.navigate().refresh();
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@DataProvider(name = "AddFsvData")
	public AddFsvModel[] getData() {
		AddFsvModel[] addFsvrModelArr = null;
		try (InputStream input = new FileInputStream("src/test/resources/data/add-fsv.json");) {
			ObjectMapper objectMapper = new ObjectMapper();

			addFsvrModelArr = objectMapper.readValue(input, AddFsvModel[].class);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return addFsvrModelArr;
	}
}
