package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //EJEMPLO 1
        // Opcion 1. Crear un objeto de forma normal
        CalculatorService service = new CalculatorService();

        // Opcion 2: Recibir un objeto de spring
        CalculatorService calculator = (CalculatorService) context.getBean("calculatorService");
        String texto = calculator.holaMundo();
        System.out.println(texto);
        // se puede volver a obtener
        // OJO: se recupera el mismo objeto
        CalculatorService calculator2 = (CalculatorService) context.getBean("calculatorService");
        texto = calculator.holaMundo();
        System.out.println(texto);

        // CONCEPTO 2: cargar un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println("gestor " +gestor.calculator.holaMundo());

        // CONCEPTO 3: scope o alcance
        // los beans por defecto son singleton, se crean el objeto y se reutiliza para toda la aplicacion
        // podemos cambiar a scope PROTOTYPE, si queremos que se cree un nuevo objeto cada vez.
        // verficarlo viendo como se ejecuta varias veces un constructor.

    }
}
