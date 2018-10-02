package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(
		exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class},
		scanBasePackages = "com.example"
)
public class Mars2MultitenantApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mars2MultitenantApplication.class, args);
	}
}
