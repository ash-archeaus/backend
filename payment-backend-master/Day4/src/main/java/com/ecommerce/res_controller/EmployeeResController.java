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

import com.ecommerce.model.Employee;
import com.ecommerce.repository.EmployeeRepo;

@RequestMapping("/employee")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeResController {
	@Autowired
private EmployeeRepo employeeRepo;

@GetMapping("/")
public List<Employee> getDetails() {
	return employeeRepo.findAll();
}

@PostMapping("/add")
public ResponseEntity<?> postDetails(@RequestBody Employee employee) {
	try {
//		 Employee employee = employeeRepo.findByName;
		List<Employee> listEmployees = 
				employeeRepo.findByEmployeename(employee.getEmployeename());	

		return new ResponseEntity<>(listEmployees, HttpStatus.ACCEPTED);
	}catch(Exception e) {
		return ResponseEntity.ok(e);
	}
		
	
	
	

//	return employeeRepo.save(employee);
}
}
