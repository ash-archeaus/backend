package com.ecommerce.res_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Logger;
import com.ecommerce.repository.LoggerRepo;

@RestController
@RequestMapping("/logger")
public class LoggerResController {
	@Autowired
	private LoggerRepo loggerRepo;

	@GetMapping("/")
	public List<Logger> getDetails() {
		return loggerRepo.findAll();
	}

	@PostMapping("/")
	public String postDetails(@RequestBody Logger logger) {
		loggerRepo.save(logger);
		return "Added";
	}
}
