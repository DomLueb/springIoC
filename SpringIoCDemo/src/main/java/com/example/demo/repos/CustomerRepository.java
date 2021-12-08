package com.example.demo.repos;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Customer;

public class CustomerRepository {
	private List<Customer> customers= 
			Arrays.asList(
                    new Customer("Dominik", "Lübbers", "dom@luebbers.net", "01234"),
                    new Customer("Hans", "Mustermann", "hans@mustermann.de", "13542323"),
                    new Customer("Marta", "Mulko", "marta@mulko.de", "3125543"));

	public List<Customer> getAllCustomers() {
		return customers;
	}

}
