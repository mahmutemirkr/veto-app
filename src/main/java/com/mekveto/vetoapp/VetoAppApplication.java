package com.mekveto.vetoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class VetoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetoAppApplication.class, args);
	}

}
