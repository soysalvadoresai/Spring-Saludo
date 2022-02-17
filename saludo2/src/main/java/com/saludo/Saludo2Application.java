package com.saludo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.saludo.controller", "com.saludo.service"})
@EntityScan("com.saludo.entity")
@EnableJpaRepositories("com.saludo.repository")
public class Saludo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Saludo2Application.class, args);
	}

}
