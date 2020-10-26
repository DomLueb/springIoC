package com.example.demo;

import org.springframework.stereotype.Service;

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
