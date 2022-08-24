package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank, String> {

}
