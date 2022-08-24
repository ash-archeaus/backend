package com.ecommerce.res_controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Customeruser;
import com.ecommerce.repository.CustomeruserRepo;

@RequestMapping("/customer")
//@RequestMapping(value="/customer", 
//			method = RequestMethod.GET, produces = "application/json")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CustomeruserResController {
	@Autowired
private CustomeruserRepo customeruserRepo;
	

@GetMapping("/")
public List<Customeruser> getDetails() {
	
	return customeruserRepo.findAll();
}

//@GetMapping("/getbyid/{id}")
//public Customeruser getById(@PathVariable Integer id) {
//	return customeruserRepo.findById(id).get();
//}


@PutMapping("/verify")
public ResponseEntity<?> Verify(@RequestBody Customeruser customeruser) {
try {

	Customeruser customeruser2 = 
			customeruserRepo.
			findById(customeruser.getUserid()).get();
//	customeruser2.setUsername(customeruser.getUsername());
	return new ResponseEntity<>(customeruser2, HttpStatus.ACCEPTED);
}
catch(Exception e) {
	return ResponseEntity.ok(e);
}


}

@PutMapping("/update")
public Customeruser Update(@RequestBody Customeruser customeruser) {
//	Optional<Customeruser> customeruser2 = customeruserRepo.findById(customeruser.getUserid());
//	
//	customeruser2.setUsername(customeruser.getUsername());
//	
//	return Optional.empty();
	return customeruserRepo.save(customeruser);
}



@PostMapping("/addcustomer")
public String postDetails(@RequestBody Customeruser customeruser) {
	customeruserRepo.save(customeruser);
	return "Added";
}
}
