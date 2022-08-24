package com.ecommerce.res_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Employee;
import com.ecommerce.repository.EmployeeRepo;

@RestController
@CrossOrigin(origins = "*")
public class Authentication {
@Autowired
private EmployeeRepo employeeRepo;

@PostMapping("/auth/login")
public boolean login(@RequestBody Employee employee) {
	
	Employee emp = employeeRepo.findById(employee.getEmployeeid()).get();
	if(emp.getEmployeepassword().equals(employee.getEmployeepassword())) {
		return true;
	}
	return false;
}
}


