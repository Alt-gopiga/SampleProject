package com.catalina.tetcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.catalina.model.AddStoreModel;
import com.catalina.pageobject.LoginPage;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TC_AddStore extends BaseClass {

	@Test(priority = 1)
	public void login() throws InterruptedException {

		Thread.sleep(3000);
		LoginPage lp = new LoginPage(driver);
		lp.setUseName(username);
		logger.info("username passed");
		lp.setPassword(password);
		logger.info("password paased");
		lp.clicklogin();
		logger.info("Login into the aplication.\r\n");
		Thread.sleep(5000);

	}

	@Test(priority = 2)
	public void NavigateToAddStore() throws InterruptedException {

		com.catalina.pageobject.AddStore addstore = new com.catalina.pageobject.AddStore(driver);

		Thread.sleep(3000);

		addstore.adminmenu();
		addstore.storemenu();
		addstore.addstoremenu();
		logger.info("Navigated To Addstore Page.\r\n");
	}

	@Test(priority = 3, dataProvider = "AddStoreData")
	public void addstore(AddStoreModel model) throws InterruptedException, IOException

	{
		Thread.sleep(3000);

		logger.info("Test Case Name : " + model.getTestName()+".\r\n");

		com.catalina.pageobject.AddStore addstore = new com.catalina.pageobject.AddStore(driver);

		addstore.set_storeName(model.getstorename());
		logger.info("Navigated To Addstore Page.\r\n");
		addstore.set_storeEin(model.getstore_ein());
		addstore.set_storeaddress(model.getstore_address());
		addstore.set_City(model.getcity());
		addstore.set_country(model.getcountry());
		Thread.sleep(1000);
		addstore.set_state(model.getstate());
		Thread.sleep(1000);
		addstore.set_ZipCode(model.getzipcode());
		addstore.set_Chain(model.getchain());
		addstore.set_PhoneNumber(model.getphonenumber());
		addstore.set_Email(model.getemail());
		addstore.set_ContactPersion(model.getcontact_persion());
		addstore.set_StoreNumber(model.getstore_number());
		addstore.set_Status(model.getstatus());
		Thread.sleep(1000);
		addstore.Addbutton();
		logger.info("Add Button Clicked.\r\n");

		try {

			Thread.sleep(3000);
			if (addstore.Add_success_msg.isDisplayed()) {
				String succ_msg = addstore.Add_success_msg.getText();
				model.isExpected();
				logger.info(succ_msg + ".\r\n" );
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			if (addstore.error_storename.isDisplayed()) {
				String err_msg = addstore.error_storename.getText();
				model.isExpected();
				logger.info(err_msg + ".\r\n" );
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			if (addstore.error_zipcode.isDisplayed()) {
				String zip_err_msg = addstore.error_zipcode.getText();
				model.isExpected();
				logger.info(zip_err_msg + ".\r\n" );
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			if (addstore.error_email.isDisplayed()) {
				String Email_err_msg = addstore.error_email.getText();
				model.isExpected();
				logger.info(Email_err_msg + ".\r\n" );
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			if (addstore.error_storeNumber.isDisplayed())

			{
				String storename_err_msg = addstore.error_storeNumber.getText();
				model.isExpected();
				logger.info(storename_err_msg + ".\r\n" );
				driver.navigate().refresh();
				Thread.sleep(1000);
			}
		}

		catch (Exception e) {

			Thread.sleep(3000);
			driver.navigate().refresh();
			logger.info(e);
		}

	}

	@DataProvider(name = "AddStoreData")
	public AddStoreModel[] getData() {
		AddStoreModel[] addStoreModelArr = null;
		try (InputStream input = new FileInputStream("src/test/resources/data/addStore.json");) {
			ObjectMapper objectMapper = new ObjectMapper();

			addStoreModelArr = objectMapper.readValue(input, AddStoreModel[].class);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return addStoreModelArr;
	}
}
