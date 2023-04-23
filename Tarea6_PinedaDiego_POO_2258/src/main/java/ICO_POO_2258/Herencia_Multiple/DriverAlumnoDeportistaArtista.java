package ICO_POO_2258.Herencia_Multiple;

public class DriverAlumnoDeportistaArtista {
    public static void main(String[] args) {
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("basket ball");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucali");
    }
}
