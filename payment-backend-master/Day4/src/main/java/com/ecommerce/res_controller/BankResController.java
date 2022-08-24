package com.ecommerce.res_controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Bank;
import com.ecommerce.repository.BankRepo;

@RequestMapping("/bank")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BankResController {
	@Autowired
private BankRepo bankrepo;


@PostMapping("/bankdetails") 
public ResponseEntity<?> bankDetails(@RequestBody Bank bank) {
	if(bankrepo.findById(bank.getBic()).isEmpty()) {
		return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
	}
	Bank bank2 = bankrepo.findById(bank.getBic()).get();
	return ResponseEntity.ok(bank2);
}



}
