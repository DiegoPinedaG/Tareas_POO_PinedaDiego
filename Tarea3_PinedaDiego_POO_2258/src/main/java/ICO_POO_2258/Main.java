package ICO_POO_2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);
        System.out.print("Introdusca una cadena de 9 caracteres usando solo X, O y _: ");
        String gato = cadena.nextLine();
        String [] juegogato = gato.trim().split("");
        System.out.println("El juego queda de la siguiente manera:");
        System.out.println("_____");
        System.out.println("|"+juegogato[0]+juegogato[1]+juegogato[2]+"|");
        System.out.println("|"+juegogato[3]+juegogato[4]+juegogato[5]+"|");
        System.out.println("|"+juegogato[6]+juegogato[7]+juegogato[8]+"|");
        System.out.println("_____");
    }
}