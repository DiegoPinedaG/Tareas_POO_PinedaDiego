package ICO_POO_2258;

public class Gatos {
    public static void main(String[] args) {
        Cat gato1 = new Cat();
        System.out.println(gato1);
        System.out.println(gato1.maullar());
        System.out.println(gato1.comer());
        System.out.println(gato1.dormir());
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        Cat gato2 = new Cat("Neko" , (byte) 5, "Corto y suave" , "Bobtail japonés");
        System.out.println(gato2);
        System.out.println(gato2.maullar());
        System.out.println(gato2.comer());
        System.out.println(gato2.dormir());
    }
}
