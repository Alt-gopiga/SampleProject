package com.catalina.tetcases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.catalina.model.SearchUserModel;
import com.catalina.pageobject.LoginPage;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TC_SearchUser extends BaseClass {

	@Test(priority = 1)
	public void login() throws InterruptedException {
		System.out.println("Login....");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(5000);
		lp.setUseName(username);
		logger.info("username passed");
		lp.setPassword(password);
		logger.info("password paased");
		lp.clicklogin();
		Thread.sleep(5000);
		
		
	}

	@Test(priority = 2)
	public void navigateToSearchUser() throws InterruptedException {
		Thread.sleep(5000);
		
		com.catalina.pageobject.SearchUser searchUser = new com.catalina.pageobject.SearchUser(driver);
		searchUser.clickAdminMenu();
		searchUser.clickUserMenu();
		searchUser.clickSearchuser();
		Thread.sleep(3000);

	}
	
	@Test(priority = 3, dataProvider = "SearchUserData")
	
	public void SearchUser(SearchUserModel model) throws InterruptedException, IOException {
		logger.info("Test Case Name : "+model.getTestName());
		Thread.sleep(5000);
		com.catalina.pageobject.SearchUser searchUser = new com.catalina.pageobject.SearchUser(driver);
		searchUser.firstName.clear();
		searchUser.setFirstName(model.getFirstName());
		searchUser.lastName.clear();
		searchUser.setLastName(model.getLastName());
		searchUser.phoneNumber.clear();
		searchUser.setPhoneNumber(model.getPhoneNumber());
		//searchUser.status.clear();
		searchUser.setstatus(model.getStatus());
		//searchUser.FSV.clear();
		searchUser.setselect(model.getSelectFsv());
		searchUser.clicksearch();
		Thread.sleep(5000);
		assertEquals(searchUser.userList.isDisplayed(), model.isExpected());
		captureScreen(driver, "searchuser");
		
	}
	
	@DataProvider(name = "SearchUserData")
	public SearchUserModel[] getData() {
		SearchUserModel[] searchUserModelArr = null;
		try (InputStream input = new FileInputStream("src/test/resources/data/search-user.json")) {
			ObjectMapper objectMapper = new ObjectMapper();
 
			searchUserModelArr = objectMapper.readValue(input, SearchUserModel[].class);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return searchUserModelArr;
	}

}
