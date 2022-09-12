package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private BookRepository repoBook;

    @Autowired
    public BookController(BookRepository repoBook){
        this.repoBook = repoBook;
    }
    // CRUD sobre la entidad Book.
    // find all books
    @GetMapping(path = "/api/books")
    public List<Book> findAll(){
        return repoBook.findAll();
    }
    // find one book with id.
    @GetMapping(path = "/api/book/{id}")
    public ResponseEntity<Book> findOne(@PathVariable Long id){
        Optional<Book> book = repoBook.findById(id);
        if(book.isPresent())
            return ResponseEntity.ok(book.get());
        else
            return ResponseEntity.notFound().build();
        // return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    // create one book and save database.
    @PostMapping( path = "/api/books")
    public Book create(@RequestBody Book book, @RequestHeader HttpHeaders headers ){
        System.out.println(headers.get("User-Agent"));
        return repoBook.save(book);
    }
    // update existing book.

    @PutMapping( path= "/api/books/{id}")
    public ResponseEntity<Book> update(@RequestBody Book book, @PathVariable Long id ){
        if( repoBook.findById(id).isPresent()){
            Optional<Book> findBook = repoBook.findById(id);
            return ResponseEntity.ok(findBook.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // delete book in the database.
}
