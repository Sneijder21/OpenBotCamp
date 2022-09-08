package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo greeting = (Saludo) context.getBean("saludo");
        String great = greeting.imprimirSaludo();
        System.out.println("Saludito: "+ great);
    }
}
