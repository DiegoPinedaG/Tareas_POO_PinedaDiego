package ICO_POO_2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres cualquiera: ");
        String caracteres = cadena.nextLine();
        boolean susecivo = true;
        for (int i = 0; i < caracteres.length() -1; i++){
            char uno = caracteres.charAt(i);
            char dos = caracteres.charAt(i+1);
            if ((int) dos - (int) uno != 1){
                susecivo = false;
                break;
            }
        }
        System.out.println("Resultado: " + susecivo);
        System.out.println("Si el resultado fue true la cadena de caracteres introducida es una cadena suseciva dentro del código ASCII, si por el contrario el resultado fue false la cadena no es suseciva dentro del código ASCII.");
    }
}