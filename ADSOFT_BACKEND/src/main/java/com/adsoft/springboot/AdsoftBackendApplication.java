package com.adsoft.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.adsoft.springboot")
@ComponentScan("com.adsoft.springboot")
@SpringBootApplication
public class AdsoftBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdsoftBackendApplication.class, args);
	}

}
