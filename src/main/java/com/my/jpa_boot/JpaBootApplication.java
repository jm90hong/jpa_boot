package com.my.jpa_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.my.jpa_boot.repository")
@EnableJpaAuditing
public class JpaBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaBootApplication.class, args);
	}

}
 