package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message, String> {

}
