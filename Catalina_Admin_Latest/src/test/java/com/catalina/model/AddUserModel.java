package com.catalina.model;

import java.io.Serializable;

public class AddUserModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String testName;
	private boolean expected;
	private String userName;
	private String firstName;
	private String lastName;
	private String middleName;
	private String password;
	private String email;
	private String phoneNumber;
	private String workPhone;
	private String mobileNumber;
	private String dateofbirth;
	private String groupName;
	private String status;
	private String emailVerified;
	private String fsv;
	private String employeenumber;
	
	
	
	public String getid() {
		return id;
	}
	public void setide(String id) {
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(String emailVerified) {
		this.emailVerified = emailVerified;
	}
	public String getfsv() {
		return fsv;
	}
	public void setfsv(String fsv) {
		this.fsv = fsv;
	}
	public String getemployeenumber() {
		return employeenumber;
	}
	public void setemployeenumber(String employee_number) {
		this.employeenumber = employee_number;
	}
	
	
	

}
