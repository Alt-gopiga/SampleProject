package com.catalina.tetcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.catalina.model.CreateSurveyModel;
import com.catalina.pageobject.LoginPage;
import com.catalina.pageobject.create_survey;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TC_CreateSurvey extends BaseClass {

	@Test(priority = 1)
	public void login() throws InterruptedException {
		System.out.println("Login....");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(10000);
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
		
		create_survey cr_sur = new create_survey(driver);
		
		cr_sur.clickAdminMenu();
		cr_sur.SurveyMenu();
		cr_sur.CreateSurveyMenu();
		Thread.sleep(10000);
		
	}
	
@Test(priority = 3, dataProvider = "CreateSurveyData")
	
	public void createsurvey(CreateSurveyModel model) throws InterruptedException, IOException {
		
		Thread.sleep(5000);
		logger.info("Test Case Name : "+ model.getTestName());
		
		create_survey cr_sur = new create_survey(driver);
		
		cr_sur.set_survey_name(model.getsurveyName());
		logger.info("surveyName provided.\r\n");
		cr_sur.survey_type();
		cr_sur.effectivedate_field();
		//cr_sur.effective_year(model.geteffective_year());
		//cr_sur.effective_month(model.geteffective_month());
		cr_sur.effective_date();
		//cr_sur.expiry_year(model.getexpiry_year());
		//cr_sur.expirye_month(model.getexpiry_month());
		cr_sur.expiry_date();
		cr_sur.survey_cutoff(model.getsurveyCutoff());
		
		
		logger.info("Save Button Clicked.\r\n");


}
@DataProvider(name = "CreateSurveyData")
public CreateSurveyModel[] getData() {
	CreateSurveyModel[] CreateSurveyModelArr = null;
	try (InputStream input = new FileInputStream("src/test/resources/data/CreateSurvey.json");) {
		ObjectMapper objectMapper = new ObjectMapper();

		CreateSurveyModelArr = objectMapper.readValue(input, CreateSurveyModel[].class);
	} 
	catch (Exception e) {
		logger.info(e.getMessage());
	}
	return CreateSurveyModelArr;
}



}