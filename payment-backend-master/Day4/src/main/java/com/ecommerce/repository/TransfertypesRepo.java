package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Transfertypes;

@Repository
public interface TransfertypesRepo extends JpaRepository<Transfertypes, String> {

}
