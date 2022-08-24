package com.ecommerce.res_controller;



import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Customer;
import com.ecommerce.model.Transaction;
import com.ecommerce.repository.CustomerRepo;
import com.ecommerce.repository.TransactionRepo;


@RequestMapping("/transaction")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TransactionResController {
	@Autowired
	private TransactionRepo transactionRepo;
	@Autowired
	private CustomerRepo customerRepo;
	
	

	
@PostMapping("/savedata")
public ResponseEntity<?> savedata(@RequestBody Transaction transaction) {
	try{
		Customer customer = customerRepo.findById(transaction.getCustomer().getCustomerid()).get();

		if(customer.getOverdraftflag()==1 || 
				customer.getClearbalance()>=transaction.getInramount()+transaction.getTransferfees()
				)
				{
				transaction.setStatus("SUCCESS");
				customer.setClearbalance(customer.getClearbalance()
						- transaction.getInramount()-transaction.getTransferfees());//we are deducting the amount here...
				customerRepo.save(customer);
				}
		else {
			transaction.setStatus("FAILED");
			transactionRepo.save(transaction);
		return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
		}
		
		transactionRepo.save(transaction);
	return new ResponseEntity<>(transaction,HttpStatus.ACCEPTED);
	}
	
	catch(Exception e) {
		 
		return ResponseEntity.ok(e);
	}
}}	


	


