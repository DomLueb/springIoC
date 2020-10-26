package com.example.demo.repos;

import java.util.Arrays;
import java.util.List;

import com.example.demo.Customer;
import com.example.demo.ICustomerRepo;

public class CustomerRepositoryB implements ICustomerRepo {
	private List<Customer> customers= 
			Arrays.asList(
                    new Customer("Franz", "Ferdinand", "franz@ferdinand.com", "0123234"),
                    new Customer("Markus", "Meier", "markus@meier.de", "40343253"));

	public List<Customer> getAllCustomers() {
		return customers;
	}

}
