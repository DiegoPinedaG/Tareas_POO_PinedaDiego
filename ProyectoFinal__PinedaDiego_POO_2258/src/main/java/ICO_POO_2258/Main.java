package ICO_POO_2258;

import ICO_POO_2258.Controlador.ControladorAlumnosH;
import ICO_POO_2258.Vista.VentanaA;

public class Main {
    public static void main(String[] args) {
        VentanaA programa = new VentanaA("Alumnos Hogwarts");
        ControladorAlumnosH ventena = new ControladorAlumnosH(programa);
    }
}