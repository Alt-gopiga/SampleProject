package com.catalina.model;

import java.io.Serializable;

public class CreateSurveyModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String testName;
	private boolean expected;
	private String surveyName;
	private String surveyType;
	private String effective_year;
	private String effective_month;
	private String effective_date;
	private String expiry_year;
	private String expiry_month;
	private String expiry_date;
	private String surveyCutoff;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public boolean isExpected() {
		return expected;
	}

	public void setExpected(boolean expected) {
		this.expected = expected;
	}

	public String getsurveyName() {
		return surveyName;
	}

	public void setsurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getsurveyType() {
		return surveyType;
	}
	
	public void setsurveyType(String surveyType) {
		this.surveyType = surveyType;
	}

	public String geteffective_year() {
		return effective_year;
	}

	public void seteffective_year(String effective_year) {
		this.effective_year = effective_year;
	}
	
	public String geteffective_month() {
		return effective_month;
	}

	public void seteffective_month(String effective_month) {
		this.effective_month = effective_month;
	}
	
	public String geteffective_date() {
		return effective_date;
	}

	public void seteffective_date(String effective_date) {
		this.effective_date = effective_date;
	}
	

	public String getexpiry_year() {
		return expiry_year;
	}

	public void setexpiry_year(String expiry_year) {
		this.expiry_year = expiry_year;
	}
	
	public String getexpiry_month() {
		return expiry_month;
	}

	public void setexpiry_month(String expiry_month) {
		this.expiry_month = expiry_month;
	}
	
	public String getexpiry_date() {
		return expiry_date;
	}

	public void setexpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	
	public String getsurveyCutoff() {
		return surveyCutoff;
	}

	public void setsurveyCutoff(String surveyCutoff) {
		this.surveyCutoff = surveyCutoff;
	}

}
