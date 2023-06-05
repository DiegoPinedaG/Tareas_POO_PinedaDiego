package ICO_POO_2258.Modelo;

import ICO_POO_2258.Conexion.AlumnosDOA;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaA implements TableModel {
    private ArrayList<AlumnoHogwarts> datos;
    public static final int COLS = 6;
    private AlumnosDOA ldao;

    public ModeloTablaA() {
        datos = new ArrayList<>();
        ldao = new AlumnosDOA();
    }

    public ModeloTablaA(ArrayList<AlumnoHogwarts> datos) {
        this.datos = datos;
        ldao = new AlumnosDOA();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nomCol = "";
        switch (columnIndex) {
            case 0:
                nomCol = "ID";
                break;
            case 1:
                nomCol = "Nombre del Personaje";
                break;
            case 2:
                nomCol = "Casa";
                break;
            case 3:
                nomCol = "Tipo de Sangre";
                break;
            case 4:
                nomCol = "Actor que lo interpreta";
                break;
            case 5:
                nomCol = "URL";
                break;
            default:
                nomCol = "";
        }
        return nomCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AlumnoHogwarts tpm = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tpm.getId();
            case 1:
                return tpm.getNombre();
            case 2:
                return tpm.getCasa();
            case 3:
                return tpm.getTipoSangre();
            case 4:
                return tpm.getActor();
            case 5:
                return tpm.getUrl();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId((int)aValue);
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setCasa((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setTipoSangre((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setActor((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarAlumno(AlumnoHogwarts alumno){
        datos.add(alumno);
    }
    public AlumnoHogwarts getAlumnoAtIndex(int in){
        return datos.get(in);
    }
    public void cargarDatos(){
        try {
            datos = ldao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

    }
    public boolean agregarAlumnoB(AlumnoHogwarts aHog){
        boolean resultado = false;
        try {
            if(ldao.insertar(aHog)){
                datos.add(aHog);
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public boolean borrarAlumno(String numero){
        boolean res = false;
        try {
            if (ldao.delete(numero)){
                System.out.println("Se borro al alumno.");
                res = true;
            }else{
                System.out.println("Error.");
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    public boolean actualizarAlumno(AlumnoHogwarts alumAc){
        boolean result = false;
        try {
            if(ldao.update(alumAc)){
                System.out.println("Actualizado");
                result = true;
            }else{
                System.out.println("No se actualizo");
                result = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return result;
    }
}
