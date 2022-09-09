package company;

public class _03Functions {

    public static void main(String[] args) {

        holaMundo();
        holaMundo();
        holaMundo("Sneijder");
        holaMundo(2);

        String devolve = devolverHolaMundo();
        System.out.println(devolve);

    }
    // protected, accesible para todos, dentro del mismo package
    protected static void holaMundo(String sneijder) {
        System.out.println("Hola " + sneijder );
    }

    private static void holaMundo(Integer number ){
        System.out.println("hola integer" + number );
    }

    private static void holaMundo() {
        System.out.println("Hola mundo desde un metodo");
    }

    private static String devolverHolaMundo(){
        return "devolver texto";
    }

    private static int sum( int num1, int num2 ){
        return num1 + num2;
    }
}
