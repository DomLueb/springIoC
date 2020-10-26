package com.example.demo.repos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.ICustomerRepo;

@Configuration
public class CustomerRepoProvision {
	@Value("${app.repo.variante}")
	private String variante;
	
	@Bean
	public ICustomerRepo createCustomerRepo() {
		if (variante.equalsIgnoreCase("A")) {
			return new CustomerRepositoryA();
		} else {
			return new CustomerRepositoryB();
		}
	}

}
