package com.laptop.exercise4;

import com.laptop.exercise4.entity.LaptopEntity;
import com.laptop.exercise4.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Exercise4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Exercise4Application.class, args);
		LaptopRepository repoLaptop = context.getBean(LaptopRepository.class);
		LaptopEntity newNote = new LaptopEntity(null,"Thinkbook","Lenovo",230.22, LocalDate.now());
		repoLaptop.save(newNote);
		System.out.println(repoLaptop.count());
		System.out.println(repoLaptop.findAll());
	}

}
