package company;

public class _08SwitchCase {
    public static void main(String[] args) {
        String weather = "sky";

        switch (weather) {
            case "Sunny" -> System.out.println("El tiempo es soleado");
            case "cloudy" -> System.out.println("El tiempo es nublado");
            default -> System.out.println("No se encuentra ninguno de los textos");
        }
    }
}
