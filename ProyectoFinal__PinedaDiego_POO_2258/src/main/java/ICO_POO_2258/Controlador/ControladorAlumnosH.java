package ICO_POO_2258.Controlador;

import ICO_POO_2258.Modelo.AlumnoHogwarts;
import ICO_POO_2258.Modelo.ModeloTablaA;
import ICO_POO_2258.Vista.VentanaA;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorAlumnosH extends MouseAdapter {
    private VentanaA view;
    private ModeloTablaA modelo;

    public ControladorAlumnosH(VentanaA view) {
        this.view = view;
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTablaA().addMouseListener(this);
        modelo = new ModeloTablaA();
        this.view.getTablaA().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnBorrar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnAgregar()){
            System.out.println("Click en boton");
            AlumnoHogwarts alum = new AlumnoHogwarts();
            alum.setId(0);
            alum.setNombre(view.getTxtNombre().getText());
            alum.setCasa(view.getTxtCasa().getText());
            alum.setTipoSangre(view.getTxtTipoSangre().getText());
            alum.setActor(view.getTxtActor().getText());
            alum.setUrl(view.getTxtUrl().getText());
            if (modelo.agregarAlumnoB(alum)){
                JOptionPane.showMessageDialog(view,"Agregado correctamente.", "Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos.","Error al agregar",JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTablaA().updateUI();
            this.view.getTxtNombre().setText("");
            this.view.getTxtCasa().setText("");
            this.view.getTxtTipoSangre().setText("");
            this.view.getTxtActor().setText("");
            this.view.getTxtUrl().setText("");

        }
        if (e.getSource() == view.getTablaA()){
            System.out.println("Click en la tabla");
            int index = this.view.getTablaA().getSelectedRow();
            AlumnoHogwarts tmpA = modelo.getAlumnoAtIndex(index);
            try {
                this.view.getLblImagen().setIcon(tmpA.getImage());
            }catch (MalformedURLException mfue){
                System.out.println(e.toString());
            }
        }
        if (e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos();
            this.view.getTablaA().updateUI();
        }
        if (e.getSource() == this.view.getBtnBorrar()){
            String datoB = view.getTxtBorrar().getText();
            int respuesta = JOptionPane.showConfirmDialog(view,"Estas seguro que deseas borrar este dato?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION){
                modelo.borrarAlumno(datoB);
                JOptionPane.showMessageDialog(view, "Listo, se a borrado correctamente al alumno.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(view,"Entendido no se borrara nada.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
            this.view.getTxtBorrar().setText("");
        }
        if (e.getSource() == this.view.getBtnActualizar()){
            AlumnoHogwarts al = new AlumnoHogwarts();
            al.setId(Integer.parseInt(view.getTxtIdA().getText()));
            al.setNombre(view.getTxtNombreA().getText());
            al.setCasa(view.getTxtCasaA().getText());
            al.setTipoSangre(view.getTxtTipoSangreA().getText());
            al.setActor(view.getTxtActorA().getText());
            al.setUrl(view.getTxtActualizar().getText());
            if (modelo.actualizarAlumno(al)){
                JOptionPane.showMessageDialog(view,"Alumno actualizado.","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(view,"No se actualizo al alumno","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }
            this.view.getTxtIdA().setText("");
            this.view.getTxtNombreA().setText("");
            this.view.getTxtCasaA().setText("");
            this.view.getTxtTipoSangreA().setText("");
            this.view.getTxtActorA().setText("");
            this.view.getTxtActualizar().setText("");
        }
    }
}
