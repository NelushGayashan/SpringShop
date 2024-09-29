package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ShoppingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingProjectApplication.class, args);
	}

}
