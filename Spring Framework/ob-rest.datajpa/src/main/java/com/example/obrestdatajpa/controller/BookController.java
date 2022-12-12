package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private  final Logger log = LoggerFactory.getLogger(BookController.class);
    private BookRepository repoBook;

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
    @ApiOperation("Buscar un libro por clave primaria id Long")
    public ResponseEntity<Book> findOne(@ApiParam("Clave primaria tipo Long") @PathVariable Long id){
        Optional<Book> book = repoBook.findById(id);
        if(book.isPresent())
            return ResponseEntity.ok(book.get());
        else
            return ResponseEntity.notFound().build();
        // return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    // create one book and save database.
    @PostMapping( path = "/api/books")
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers ){
        System.out.println(headers.get("User-Agent"));
        if(book.getId() != null ){
            log.warn("trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        Book result = repoBook.save(book);
        return ResponseEntity.ok(result);
    }
    // update existing book.

    @PutMapping( path= "/api/books")
    public ResponseEntity<Book> update(@RequestBody Book book){
        if(book.getId() == null ){
            log.warn("trying to update a non existent book id null");
            return ResponseEntity.badRequest().build();
        }
        if(!repoBook.existsById(book.getId())){
            log.warn("trying to update a non existent book");
            return ResponseEntity.notFound().build();
        }
        Book result = repoBook.save(book);
        return ResponseEntity.ok(result);
   }
    // delete book in the database.
    @DeleteMapping( path = "/api/book/{id}")
    public ResponseEntity<Book> delete(@PathVariable Long id){
        if(!repoBook.existsById(id)){
            log.warn("trying to delete a book a non existent book i");
            return ResponseEntity.notFound().build();
        }
        repoBook.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @ApiIgnore
    @DeleteMapping( path = "/api/books")
    public ResponseEntity<Book> deleteAll(){
        log.info("executing method delete all book");
        if(repoBook.count() > 0 ){
            repoBook.deleteAll();
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
