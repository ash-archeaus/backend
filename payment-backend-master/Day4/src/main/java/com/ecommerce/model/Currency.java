package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currency {
	@Id
	private String currencycode;
private String  currencyname;
private Float conversionrate;


public String getCurrencycode() {
	return currencycode;
}
public void setCurrencycode(String currencycode) {
	this.currencycode = currencycode;
}
public String getCurrencyname() {
	return currencyname;
}
public void setCurrencyname(String currencyname) {
	this.currencyname = currencyname;
}
public Float getConversionrate() {
	return conversionrate;
}
public void setConversionrate(Float conversionrate) {
	this.conversionrate = conversionrate;
}

}
