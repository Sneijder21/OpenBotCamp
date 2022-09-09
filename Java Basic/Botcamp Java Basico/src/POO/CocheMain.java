package POO;

public class CocheMain {
    public static void main(String[] args) {

        Coche coche = new Coche();
        Coche coche2 = new Coche("rojo", "honda", "civic", 120.20, 12.00 );
        coche2.acelerar(50);
        System.out.println(coche2);
        coche2.peso = 150.00;
        System.out.println(coche2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Ejemplo de motor";
        cocheElectrico.color = "negro";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo= "Tesla";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico1 = new CocheElectrico("azul", "alfa", "romeo", 1500d, 4.99, "txz");
        System.out.println(cocheElectrico1);
        cocheElectrico1.acelerar(50);
        System.out.println(cocheElectrico1);
    }
}
