package com.greta.shares.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.greta")
@EntityScan(basePackages = "com.greta.shares.entity")
@EnableJpaRepositories(basePackages = "com.greta.shares.persistence")

public class SpringBootSharesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSharesServiceApplication.class, args);
	}

}
