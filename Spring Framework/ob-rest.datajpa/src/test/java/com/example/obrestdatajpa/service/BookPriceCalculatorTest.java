package com.example.obrestdatajpa.service;

import com.example.obrestdatajpa.entities.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookPriceCalculatorTest {

    @Test
    void calculatePrice() {
        // configuration de la prueba
        Book book = new Book(1l, "El señor de los anillos", "Author", 100, 49.99, LocalDate.now(), true);
        BookPriceCalculator calculator = new BookPriceCalculator();
        // se ejecuta el comportamiento a testear
        double price  = calculator.calculatePrice(book);
        // comprobaciones aserciones.
        assertTrue(price > 0);
        System.out.println(price);
        assertEquals(52.980000000000004, price);
    }
}