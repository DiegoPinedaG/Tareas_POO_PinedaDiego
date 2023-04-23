package ICO_POO_2258;

public class DriverFiguras {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Area = " + cuadrado.calcularArea());
        System.out.println("------------------Circulo---------------------");
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area = " + circulo.calcularArea());
    }
}
