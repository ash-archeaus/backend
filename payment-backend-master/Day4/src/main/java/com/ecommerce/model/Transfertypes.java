package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transfertypes {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String transfertypecode;
private String  transfertypedescription;



public String getTransfertypecode() {
	return transfertypecode;
}

public void setTransfertypecode(String transfertypecode) {
	this.transfertypecode = transfertypecode;
}

public String getTransfertypedescription() {
	return transfertypedescription;
}

public void setTransfertypedescription(String transfertypedescription) {
	this.transfertypedescription = transfertypedescription;
}

}
