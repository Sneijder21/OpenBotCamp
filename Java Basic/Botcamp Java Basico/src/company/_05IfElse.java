package company;

public class _05IfElse {
    public static void main(String[] args) {

        boolean check = 5 < 10 ;
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        if ( number1 < number2 && number2 < number3 )
            System.out.println("verdadero");
        else if ( number2 < number3)
            System.out.println("else if verdadero");
        else
            System.out.println("falso");
        System.out.println("fin");

    }
}
