package com.gitlab.adilcan.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.gitlab")
@EnableJpaRepositories(basePackages = {"com.gitlab"})
@EntityScan(basePackages = {"com.gitlab"})
@ComponentScan(basePackages = {"com.gitlab"})
public class ErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}
}
