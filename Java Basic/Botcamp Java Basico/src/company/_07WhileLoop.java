package company;

public class _07WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while( count < 10 ){
            count++; // uso de continue, counter is first declared.
            if( count == 3 )
                continue; // salta y continua con la sig iteracion
            System.out.println("Hola mundo" + (count ) );
            if ( count == 5 )
                break; // rompe el flujo de ejecución
        }
        System.out.println("Fin del programa");
    }
}
