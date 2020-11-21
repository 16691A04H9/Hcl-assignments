package com.methods;
public class Customer {
	private String name;
	private int cusId;
	private String emailId;
	private long  mobileNo;
	private String address;
	private int accNo;
	public Customer(String name, int cusId, String emailId, long mobileNo, String address, int accNo) {
		super();
		this.name = name;
		this.cusId = cusId;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.address = address;
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", cusId=" + cusId + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ ", address=" + address + ", accNo=" + accNo + "]";
	}
	
}