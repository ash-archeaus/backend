package com.ecommerce.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Logger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer loggerid;
private String screenname, action, ipaddres;
@ManyToOne
private Customer customer;

public Customer getCustomers() {
	return customer;
}
public void setCustomers(Customer customer) {
	this.customer = customer;
}
@ManyToOne
private Customeruser customeruser;

@ManyToOne
private Employee employee;

public Employee getEmployees() {
	return employee;
}
public void setEmployees(Employee employee) {
	this.employee = employee;
}
public Integer getLoggerid() {
	return loggerid;
}
public void setLoggerid(Integer loggerid) {
	this.loggerid = loggerid;
}
public String getScreenname() {
	return screenname;
}
public void setScreenname(String screenname) {
	this.screenname = screenname;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public String getIpaddres() {
	return ipaddres;
}
public void setIpaddres(String ipaddres) {
	this.ipaddres = ipaddres;
}

public Customeruser getCustomeruser() {
	return customeruser;
}
public void setCustomeruser(Customeruser customeruser) {
	this.customeruser = customeruser;
}
}


