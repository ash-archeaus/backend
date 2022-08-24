package com.ecommerce.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer transactionid;
private String recieveraccountholdernumber;
private String recieveraccountholdername;
private Float  transferfees, inramount;
private String date, status;

@ManyToOne
private Customer customer;
@ManyToOne
private Currency currency;
@ManyToOne
private Bank rcbank;
@ManyToOne
private Transfertypes transfertypes;

@OneToOne
private Message message;


public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

public Integer getTransactionid() {
	return transactionid;
}
public void setTransactionid(Integer transactionid) {
	this.transactionid = transactionid;
}

public String getRecieveraccountholdernumber() {
	return recieveraccountholdernumber;
}
public void setRecieveraccountholdernumber(String recieveraccountholdernumber) {
	this.recieveraccountholdernumber = recieveraccountholdernumber;
}
public String getRecieveraccountholdername() {
	return recieveraccountholdername;
}
public void setRecieveraccountholdername(String recieveraccountholdername) {
	this.recieveraccountholdername = recieveraccountholdername;
}

public Float getTransferfees() {
	return transferfees;
}
public void setTransferfees(Float transferfees) {
	this.transferfees = transferfees;
}
public Float getInramount() {
	return inramount;
}
public void setInramount(Float inramount) {
	this.inramount = inramount;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Currency getCurrency() {
	return currency;
}
public void setCurrency(Currency currency) {
	this.currency = currency;
}


public Bank getRcbank() {
	return rcbank;
}
public void setRcbank(Bank rcbank) {
	this.rcbank = rcbank;
}
public Transfertypes getTransfertypes() {
	return transfertypes;
}
public void setTransfertypes(Transfertypes transfertypes) {
	this.transfertypes = transfertypes;
}
public Message getMessage() {
	return message;
}
public void setMessage(Message message) {
	this.message = message;
}



}
