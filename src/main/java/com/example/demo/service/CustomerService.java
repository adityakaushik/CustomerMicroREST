package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dbo.CustomerRepository;
import com.example.demo.pojos.Customer;

@Service
public class CustomerService {
	
@Autowired 
CustomerRepository custRepo;


	public String saveCustomer(Customer cust) {
		custRepo.save(cust);
		return "Customer saved: "+cust.getName(); 
	}
}
