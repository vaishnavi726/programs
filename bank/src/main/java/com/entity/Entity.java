package com.entity;//pojo class

// initialised class


public class Entity {
	
	private String accholdername, bankname;
	private double amount;
	
	
	public String getAccholdername() {
		return accholdername;
	}
	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Entity [accholdername=" + accholdername + ", bankname=" + bankname + ", amount=" + amount + "]";
	}
	
}