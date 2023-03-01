package ICO_POO_2258;

import java.awt.*;
import java.util.Scanner;

public class Cat {
    private Color color;
    private String nombre;
    private byte edad;
    private String pelaje;
    private String especie;

    public Cat() {
    }

    public Cat(String nombre, byte edad, String pelaje, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.pelaje = pelaje;
        this.especie = especie;
    }

    public Cat(Color color, String nombre, byte edad, String pelaje, String especie) {
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
        this.pelaje = pelaje;
        this.especie = especie;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if(edad <= 30){
            this.edad = edad;
        }else{
            System.out.println("Error: Los gatos no pueden vivir tanto, por favor introdusca una edad real.");
        }
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color=" + color +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pelaje='" + pelaje + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }

    public static boolean maullar(){
        System.out.println("¿El gato está maullando?");
        boolean resultado = Math.random() > 0.51;
        return resultado;
    }

    public String comer(){
        Scanner comio = new Scanner(System.in);
        System.out.println("¿Qué a comido y bebido " + nombre + " el día de hoy?");
        String aComido = comio.nextLine();
        System.out.print("En el trascurso de lo que va del día " + nombre + " a comido y bebido: ");
        return aComido;
    }
    public byte dormir(){
        Scanner mimido = new Scanner(System.in);
        System.out.print("Escriba 1 si " + nombre + " está dormido y si está despierto escriba cualquier otro número: ");
        byte dormido = Byte.parseByte(mimido.nextLine());
        if (dormido == 1) {
            System.out.println("Shhhhh!!!, " + nombre + " se encuentra descansando no l@ vayas a despertar.");
        }else{
            System.out.println(nombre + " se encuentra despiert@ esperando que juegues con él/ella.");
        }
        return dormido;
    }
}
