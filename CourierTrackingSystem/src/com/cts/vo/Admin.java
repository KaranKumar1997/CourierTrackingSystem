package com.cts.vo;

public class Admin {
	
	private String firstName;
	private String LastName;
	private String gender;
	private String email;
	private long contactNumber;
	private long employeeId;
	private String password;
	private long salary;
	private String designation;
	private String permanentAddress;
	private String correpondanceAddress;
	private String LoginType;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getCorrepondanceAddress() {
		return correpondanceAddress;
	}
	public void setCorrepondanceAddress(String correpondanceAddress) {
		this.correpondanceAddress = correpondanceAddress;
	}
	public String getLoginType() {
		return LoginType;
	}
	public Admin(String firstName, String lastName, String gender, String email, long contactNumber, long employeeId,
			String password, long salary, String designation, String permanentAddress, String correpondanceAddress,
			String loginType) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.employeeId = employeeId;
		this.password = password;
		this.salary = salary;
		this.designation = designation;
		this.permanentAddress = permanentAddress;
		this.correpondanceAddress = correpondanceAddress;
		this.LoginType = loginType;
	}
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public void setLoginType(String loginType) {
		this.LoginType= loginType;  //i put this.
	}
	

}
