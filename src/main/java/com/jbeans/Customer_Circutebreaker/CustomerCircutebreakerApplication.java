package com.jbeans.Customer_Circutebreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerCircutebreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerCircutebreakerApplication.class, args);
	}

}
