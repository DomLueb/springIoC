package com.example.demo.notifiers;

import org.springframework.stereotype.Component;

import com.example.demo.Customer;

@Component
public class Notifier implements INotifier {
	public void sendNotification(Customer customer) {
		System.out.println("Werbung für "+customer.getLastname());
	}

}
