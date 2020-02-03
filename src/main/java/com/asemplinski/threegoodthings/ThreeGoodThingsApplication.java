package com.asemplinski.threegoodthings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.asemplinski"})
public class ThreeGoodThingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreeGoodThingsApplication.class, args);
	}

}
