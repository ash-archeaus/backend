package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

//	List<Customer> findAllByOrderByIdAsc();
//	public List<Customer>  findAllByOrderByIdAsc();
}
