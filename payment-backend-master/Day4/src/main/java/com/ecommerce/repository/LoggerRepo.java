package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Logger;


@Repository
public interface LoggerRepo extends JpaRepository<Logger, Integer> {

}
