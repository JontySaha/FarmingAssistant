package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.cg.service"})
public class FarmingAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmingAssistantApplication.class, args);
	}

}
