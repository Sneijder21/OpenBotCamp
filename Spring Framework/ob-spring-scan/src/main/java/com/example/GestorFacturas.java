package com.example;

import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {

    CalculatorService calculator;

    public GestorFacturas( CalculatorService calculator){
        System.out.println("Ejecutando constructor GestorFacturas");
        this.calculator = calculator;
    }

}
