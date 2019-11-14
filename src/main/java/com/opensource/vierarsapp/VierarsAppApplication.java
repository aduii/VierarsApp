package com.opensource.vierarsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class VierarsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VierarsAppApplication.class, args);
	}

}
