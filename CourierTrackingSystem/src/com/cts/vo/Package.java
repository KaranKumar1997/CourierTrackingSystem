package com.cts.vo;

import java.util.Date;

public class Package {
	
	private long cosignmentId;
	private String acceptDate;
	private String packageWeight;
	private String cost;
	private String senderAddress;
	private String receiverAddress;
	private long employeeId;
	private long customerId;
	private String currentLocation;
	private String packageStatus;
	
	
	public Package(long cosignmentId, String acceptDate, String packageWeight, String cost, String senderAddress,
			String receiverAddress, long employeeId, long customerId, String currentLocation, String packageStatus) {
		super();
		this.cosignmentId = cosignmentId;
		this.acceptDate = acceptDate;
		this.packageWeight = packageWeight;
		this.cost = cost;
		this.senderAddress = senderAddress;
		this.receiverAddress = receiverAddress;
		this.employeeId = employeeId;
		this.customerId = customerId;
		this.currentLocation = currentLocation;
		this.packageStatus = packageStatus;
	}
	public Package() {
		// TODO Auto-generated constructor stub
	}
	public long getCosignmentId() {
		return cosignmentId;
	}
	public void setCosignmentId(long cosignmentId) {
		this.cosignmentId = cosignmentId;
	}
	public String getAcceptDate() {
		return acceptDate;
	}
	public void setAcceptDate(String acceptDate2) {
		this.acceptDate = acceptDate2;
	}
	public String getPackageWeight() {
		return packageWeight;
	}
	public void setPackageWeight(String packageWeight2) {
		this.packageWeight = packageWeight2;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost2) {
		this.cost = cost2;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getPackageStatus() {
		return packageStatus;
	}
	public void setPackageStatus(String packageStatus) {
		this.packageStatus = packageStatus;
	}
	
	

}
