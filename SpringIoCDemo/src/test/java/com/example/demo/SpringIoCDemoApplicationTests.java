package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Arrays;

@SpringBootTest
class SpringIoCDemoApplicationTests {
	@Autowired
	private CustomerService customerService;
	
	@MockBean
	private ICustomerRepo customerRepo; 
	
	@Test
	void contextLoads() {
		Mockito.when(customerRepo.getAllCustomers()).thenReturn(Arrays.asList(new Customer("F","L","E","T")));
				
		int count= customerService.countCustomers();
		assertThat(count, is(1));
	}

}
