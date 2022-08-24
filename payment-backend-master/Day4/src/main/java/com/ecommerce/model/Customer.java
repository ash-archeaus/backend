package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private String customerid;
	
	private String  accountholdername, customeraddress, 
					customercity, customertype;
	private Integer overdraftflag;
	private Float clearbalance;


	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	public String getCustomertype() {
		return customertype;
	}
	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}
	public Integer getOverdraftflag() {
		return overdraftflag;
	}
	public void setOverdraftflag(Integer overdraftflag) {
		this.overdraftflag = overdraftflag;
	}
	public Float getClearbalance() {
		return clearbalance;
	}
	public void setClearbalance(Float clearbalance) {
		this.clearbalance = clearbalance;
	}


	

}
