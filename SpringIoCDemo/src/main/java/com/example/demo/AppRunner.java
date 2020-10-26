package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.demo.repos.CustomerRepository;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

@Component
public class AppRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Welcome to the Spring universe");
		
		Collection<Customer> customers= customerRepository.getAllCustomers();
		this.printCustomers(customers);
	}
	
	private void printCustomers(Collection<Customer> customers) {
		customers.forEach(customer -> logger.info("Customer "+customer.getLastname()));
	}
	

}
