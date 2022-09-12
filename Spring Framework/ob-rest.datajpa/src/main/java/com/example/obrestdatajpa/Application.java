package com.example.obrestdatajpa;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository repoBook = (BookRepository) context.getBean(BookRepository.class);
		// CRUD
		// crear libro
		Book book = new Book(null, "Homo Deus", "Yuval Noah", 450, 29.99, LocalDate.of(2022, 11,22),true);
		Book book2 = new Book(null, "Homo Sapiens", "Yuval Noah", 250, 19.99, LocalDate.of(2019, 11,06),true);
		//almacenar libro
		repoBook.save(book);
		repoBook.save(book2);
		// recuperar todos los libros
		System.out.println("Num book in database1: "+repoBook.findAll().size());
		// borrar un libro
		// repoBook.deleteById(1l);
		System.out.println("Num book in database2: "+ repoBook.findAll().size());
	}

}
