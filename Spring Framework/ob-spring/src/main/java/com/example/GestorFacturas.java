package com.example;

public class GestorFacturas {

    CalculatorService calculator;
    String nombre;

    public GestorFacturas( CalculatorService calculator, String nombre){
        System.out.println("Ejecutando constructor GestorFacturas");
        this.calculator = calculator;
        this.nombre = nombre;
    }

}
