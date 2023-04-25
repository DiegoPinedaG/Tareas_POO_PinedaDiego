package ICO_POO_2258;

public class DriverVeiculos {
    public static void main(String[] args) {
        Camion camion = new Camion("Disel" , 3);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("-------------------Motocicleta-----------------");
        Motocicleta moto = new Motocicleta(150  , "Yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }
}
