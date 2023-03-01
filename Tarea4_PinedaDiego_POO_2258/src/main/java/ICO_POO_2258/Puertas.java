package ICO_POO_2258;

public class Puertas {
    public static void main(String[] args) {
        Door puerta1 = new Door("Aluminio y cristal" , "Corediza automática" , 3.3F, 3.6F, true);
        System.out.println(puerta1);
        System.out.println(puerta1.rechinar());
        System.out.println(puerta1.abierta());
        System.out.println(puerta1.cerrada());
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        Door puerta2 = new Door();
        System.out.println(puerta2);
        System.out.println(puerta2.rechinar());
        System.out.println(puerta2.abierta());
        System.out.println(puerta2.cerrada());
    }
}
