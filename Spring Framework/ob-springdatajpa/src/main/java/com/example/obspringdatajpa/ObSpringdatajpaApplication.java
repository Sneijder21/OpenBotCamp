package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ObSpringdatajpaApplication.class, args);
		ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println(repository.count());
		Coche item = new Coche(null, "cadilac", "Toyota", 2022);
		repository.save(item);
		System.out.println(repository.count());

		System.out.println(repository.findAll());
	}

}
