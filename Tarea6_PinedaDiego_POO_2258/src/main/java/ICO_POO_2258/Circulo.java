package ICO_POO_2258;

public class Circulo implements Figura{
    private double radio;
    private double PI = 3.1416;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public Circulo(double radio, double PI) {
        this.radio = radio;
        this.PI = PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", PI=" + PI +
                '}';
    }

    @Override
    public double calcularArea() {
        return this.PI*this.radio*this.radio;
    }
}
