package com.example.demo;

import org.springframework.stereotype.Service;

import com.example.demo.repos.CustomerRepositoryA;

@Service
public class CustomerService {
	private final ICustomerRepo customerRepo;
	
	public CustomerService(ICustomerRepo customerRepo) {
		this.customerRepo= customerRepo;
	}
	
	public int countCustomers() {
		return customerRepo.getAllCustomers().size(); 
	}

}
