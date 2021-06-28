package com.catalina.model;

import java.io.Serializable;

public class AddFsvModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String testName;
	private String fsvname;
	private String ein;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String contactpersion;
	private String phonenumber;
	private String contactemail;
	private String status;
	private boolean expected;
	
	
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
	public String getfsvname()
	{
		return fsvname;
	}
	public void setfsvname(String fsvname)
	{
		this.fsvname = fsvname;
	}
	
	public String getein()
	{
		return ein;
	}
	public void setein(String ein)
	{
		this.ein = ein;
	}
	
	public String getaddress()
	{
		return address;
	}
	public void setaddresse(String address)
	{
		this.address = address;
	}
	
	public String getcity()
	{
		return city;
	}
	public void setcity(String city)
	{
		this.city = city;
	}
	
	public String getcountry()
	{
		return country;
	}
	public void setcountry(String country)
	{
		this.country = country;
	}
	
	public String getstate()
	{
		return state;
	}
	public void setstate(String state)
	{
		this.state = state;
	}
	
	public String getzip()
	{
		return zip;
	}
	public void setzip(String zip)
	{
		this.zip = zip;
	}
	
	public String getcontactpersion()
	{
		return contactpersion;
	}
	public void setcontactpersion(String contactpersion)
	{
		this.contactpersion = contactpersion;
	}
	
	public String getphonenumber()
	{
		return phonenumber;
	}
	public void setphonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	public String getcontactemail()
	{
		return contactemail;
	}
	public void setcontactemail(String contactemail)
	{
		this.contactemail = contactemail;
	}
	
	public String getstatus()
	{
		return status;
	}
	public void setstatus(String status)
	{
		this.status = status;
	}
	public boolean isExpected() {
		return expected;
	}
	public void setExpected(boolean expected) {
		this.expected = expected;
	}

}
