package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojos.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/adi")
@CrossOrigin(origins = "*")
public class CustomerController {
	@Autowired
	CustomerService custService;
	
	
	@PostMapping(value = "/addCustomer")
	public String editAProperty(@RequestBody Customer pc) throws IOException, Exception {
	
		System.out.println("asas");
		return custService.saveCustomer(pc);
	
	}
	
}
