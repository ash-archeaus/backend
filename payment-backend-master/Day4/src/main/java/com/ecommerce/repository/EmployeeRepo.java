package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {
List<Employee> findByEmployeename(String employeename);
}
