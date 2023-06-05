package ICO_POO_2258.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AlumnoHogwarts {
    private int id;
    private String nombre;
    private String casa;
    private String tipoSangre;
    private String actor;
    private String url;

    public AlumnoHogwarts() {
    }

    public AlumnoHogwarts(int id, String nombre, String casa, String tipoSangre, String actor, String url) {
        this.id = id;
        this.nombre = nombre;
        this.casa = casa;
        this.tipoSangre = tipoSangre;
        this.actor = actor;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "AlumnoHogwarts{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", casa='" + casa + '\'' +
                ", tipoSangre='" + tipoSangre + '\'' +
                ", actor='" + actor + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
    public ImageIcon getImage() throws MalformedURLException {
        URL urlImag = new URL(this.url);
        return new ImageIcon(urlImag);
    }
}
