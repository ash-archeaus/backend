package com.ecommerce.res_controller;

import java.util.List;
import java.util.Optional;

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
import com.ecommerce.repository.CustomerRepo;

@RequestMapping("/customers")
@RestController
@CrossOrigin(origins = "*")
public class CustomerResController {
	@Autowired
private CustomerRepo customerRepo;
	
	@GetMapping("/CustomerGet")
	  public List<Customer> listCustomers(){
        return customerRepo.findAll();
    }
	
//	@PostMapping("/CustomerPost")
//	public Customer AddNewCustomer(@RequestBody Customer custt) {
//		return(customerRepo.save(custt));
//		
////		return ("Added New Customer");
//    }
	
	
@PostMapping("/detailsofcustomer")
public ResponseEntity<?> Details(@RequestBody Customer customer) {

	if(customerRepo.findById(customer.getCustomerid()).isEmpty()) {
		return new ResponseEntity<>("User Not Found",HttpStatus.NOT_FOUND);
	}
	Optional<Customer> customer2 = 
			customerRepo.findById(customer.getCustomerid());
	return  ResponseEntity.ok(customer2);
}

}
