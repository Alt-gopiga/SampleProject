package com.catalina.model;

import java.io.Serializable;

public class AddStoreModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	private String testName;
	private String storename;
	private String store_ein;
	private String store_address;
	private String city;
	private String country;
	private String state;
	private String zipcode;
	private String chain;
	private String phonenumber;
	private String email;
	private String contact_persion;
	private String store_number;
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

	public String getstorename()
	{
		return storename;
	}
	public void setstorename(String storeName)
	{
		this.storename = storeName;
	}
	
	public String getstore_ein()
	{
		return store_ein;
	}
	public void setstore_ein(String store_Ein)
	{
		this.store_ein = store_Ein;
	}
	
	public String getstore_address()
	{
		return store_address;
	}
	public void setstore_address(String store_Address)
	{
		this.store_address = store_Address;
	}
	
	public String getcity()
	{
		return city;
	}
	public void setcity(String City)
	{
		this.city = City;
	}
	
	public String getcountry()
	{
		return country;
	}
	public void setcountry(String Country)
	{
		this.country = Country;
	}
	
	public String getstate()
	{
		return state;
	}
	public void setstate(String State)
	{
		this.state = State;
	}
	
	public String getzipcode()
	{
		return zipcode;
	}
	public void setzipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}
	
	public String getchain()
	{
		return chain;
	}
	public void setchain(String chain)
	{
		this.chain = chain;
	}
	
	public String getphonenumber()
	{
		return phonenumber;
	}
	public void setphonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	public String getemail()
	{
		return email;
	}
	public void setemail(String email)
	{
		this.email = email;
	}
	
	public String getcontact_persion()
	{
		return contact_persion;
	}
	public void setcontact_persion(String contact_persion)
	{
		this.contact_persion = contact_persion;
	}
	
	public String getstore_number()
	{
		return store_number;
	}
	public void setstore_number(String store_number)
	{
		this.store_number = store_number;
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
