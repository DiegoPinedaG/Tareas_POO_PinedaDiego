package ICO_POO_2258;

import java.util.Scanner;

public class Door {
    private String material;
    private String tipo;
    private float alturaEnMetros;
    private float anchoEnMetros;
    private boolean ventana;

    public Door() {
    }

    public Door(String material, String tipo, float alturaEnMetros, float anchoEnMetros, boolean ventana) {
        this.material = material;
        this.tipo = tipo;
        this.alturaEnMetros = alturaEnMetros;
        this.anchoEnMetros = anchoEnMetros;
        this.ventana = ventana;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getAlturaEnMetros() {
        return alturaEnMetros;
    }

    public void setAlturaEnMetros(float alturaEnMetros) {
        this.alturaEnMetros = alturaEnMetros;
    }

    public float getAnchoEnMetros() {
        return anchoEnMetros;
    }

    public void setAnchoEnMetros(float anchoEnMetros) {
        this.anchoEnMetros = anchoEnMetros;
    }

    public boolean isVentana() {
        return ventana;
    }

    public void setVentana(boolean ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "Door{" +
                "material='" + material + '\'' +
                ", tipo='" + tipo + '\'' +
                ", alturaEnMetros=" + alturaEnMetros +
                ", anchoEnMetros=" + anchoEnMetros +
                ", ventana=" + ventana +
                '}';
    }

    public boolean rechinar(){
        boolean resultado = Math.random() >= 0.51;
        System.out.println("¿La puerta rechina?");
        return resultado;
    }
    public boolean abierta(){
        boolean resultadoA = Math.random() >= 0.51;
        System.out.println("¿La puerta está abierta?");
        return resultadoA;
    }
    public boolean cerrada(){
        boolean resultadoB = Math.random() <= 0.50;
        System.out.println("¿La puerta está cerrada?");
        return resultadoB;
    }
}
