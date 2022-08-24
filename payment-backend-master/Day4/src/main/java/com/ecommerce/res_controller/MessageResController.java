package com.ecommerce.res_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Message;
import com.ecommerce.repository.MessageRepo;

@RequestMapping("/message")
@RestController
public class MessageResController {
	@Autowired
	private MessageRepo messageRepo;

	@GetMapping("/")
	public List<Message> getDetails() {
		return messageRepo.findAll();
	}

	@PostMapping("/")
	public String postDetails(@RequestBody Message message) {
		messageRepo.save(message);
		return "Added";
	}
}
