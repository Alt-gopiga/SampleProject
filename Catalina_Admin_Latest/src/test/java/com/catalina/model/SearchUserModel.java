package com.catalina.model;

import java.io.Serializable;

public class SearchUserModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String testName;
	private boolean expected;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String status;
	private String selectFsv;
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isExpected() {
		return expected;
	}
	public void setExpected(boolean expected) {
		this.expected = expected;
	}
	public String getSelectFsv() {
		return selectFsv;
	}
	public void setSelectFsv(String selectFsv) {
		this.selectFsv = selectFsv;
	}
	
	
}