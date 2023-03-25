package ICO_POO_2258;

import java.util.Arrays;

public class MaquinaDeCafe {
    private int agua; //ml
    private int cafe; //g
    private int crema; //ml
    private int capVasos;
    private int vasos;

    public MaquinaDeCafe() {
    }
    public MaquinaDeCafe(int agua, int cafe, int crema, int capVasos, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.capVasos = capVasos;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if (agua >= 0 && agua <= 5000) {
            this.agua = agua;
        }else{
            System.out.println("La máquina no tiene tanta capacidad para el agua.");
        }
    }

    public int getCafe() {
            return cafe;
    }

    public void setCafe(int cafe) {
        if (cafe >= 0 && cafe <= 1000){
            this.cafe = cafe;
        }else{
            System.out.println("La máquina no tiene tanta capacidad para el agua.");
        }
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if (crema >= 0 && crema <= 1500){
            this.crema = crema;
        }else{
            System.out.println("La máquina no tiene tanta capacidad para la crema.");
        }
    }

    public int getCapVasos() {
        return capVasos;
    }

    public void setCapVasos(int capVasos) {
        if (capVasos >=0 && capVasos <= 75) {
            this.capVasos = capVasos;
        }else{
            System.out.println("No existen máquinas con tanta capacidad de vasos.");
        }
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if (vasos >= 0 && vasos <= capVasos) {
            this.vasos = vasos;
        }else{
            System.out.println("La máquina solo tiene capacidad para un maximo de " + capVasos + " vasos.");
        }
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", capVasos=" + capVasos +
                ", vasos=" + vasos +
                '}';
    }

    public void hacindoCafeAmericano(){
        if (agua >= 180 && cafe >= 15 && vasos >= 1) {
            agua = agua - 180;
            cafe = cafe - 15;
            vasos = vasos -1;
            System.out.println("Café Americano listo ;)");
        }else{
            System.out.println("La máquina se quedo sin recursos para hacer el café americano.");
        }
    }
    public void hacindoExpreso(){
        if (agua >= 120 && cafe >= 20 && vasos >= 1) {
            agua = agua - 120;
            cafe = cafe - 20;
            vasos = vasos -1;
            System.out.println("Expreso listo ;)");
        }else{
            System.out.println("La máquina se quedo sin recursos para hacer el expreso.");
        }
    }
    public void haciendoCapuchino(){
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos >= 1) {
        agua = agua - 100;
        cafe = cafe - 14;
        crema = crema - 70;
        vasos = vasos -1;
        System.out.println("Capuchino listo ;)");
        }else{
            System.out.println("La máquina se quedo sin recursos para hacer el capuchino.");
        }
    }
}
