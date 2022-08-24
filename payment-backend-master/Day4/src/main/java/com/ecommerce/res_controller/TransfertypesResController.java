package com.ecommerce.res_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.model.Transfertypes;
import com.ecommerce.repository.TransfertypesRepo;

public class TransfertypesResController {
	@Autowired
	private TransfertypesRepo transfertypesRepo;

	@GetMapping("/")
	public List<Transfertypes> getDetails() {
		return transfertypesRepo.findAll();
	}

	@PostMapping("/")
	public String postDetails(@RequestBody Transfertypes transfertypes) {
		transfertypesRepo.save(transfertypes);
		return "Added";
	}
}
