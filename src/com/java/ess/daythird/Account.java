package com.java.ess.daythird;

public class Account implements FilterMethod {
	
	int acId;
	String acName;
	float balance;
	
	
	public Account() {
		
	}


	public Account(int acId, String acName, float balance) {
		
		this.acId = acId;
		this.acName = acName;
		this.balance = balance;
	}


	public int getAcId() {
		return acId;
	}


	public void setAcId(int acId) {
		this.acId = acId;
	}


	public String getAcName() {
		return acName;
	}


	public void setAcName(String acName) {
		this.acName = acName;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void deposit(float bal) {
		balance+= bal;
		System.out.print("Inside the deposit method");
	}

}
