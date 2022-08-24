package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String messagecode;
private String instruction;





public String getMessagecode() {
	return messagecode;
}

public void setMessagecode(String messagecode) {
	this.messagecode = messagecode;
}

public String getInstruction() {
	return instruction;
}

public void setInstruction(String instruction) {
	this.instruction = instruction;
}

}
