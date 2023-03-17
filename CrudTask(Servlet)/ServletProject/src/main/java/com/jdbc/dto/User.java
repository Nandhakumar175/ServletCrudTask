package com.jdbc.dto;

public class User {

	private Integer id;
    private String Name;
	private String FatherName;
	private String Phone;
	private String Email;
	private String City;
	private String State;
	private String Pincode;
	public User(String name, String fatherName, String phone, String email, String city, String state, String pincode) {
		super();
		Name = name;
		FatherName = fatherName;
		Phone = phone;
		Email = email;
		City = city;
		State = state;
		Pincode = pincode;
	}
	
	
	
	public User(Integer id) {
		this.id = id;
		
	}



	


	


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	

	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	
	
	
	
	

}
