package ICO_POO_2258.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaA extends JFrame {
    private JLabel lblId;
    private JTextField txtId;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblCasa;
    private JTextField txtCasa;
    private JLabel lblTipoSangre;
    private JTextField txtTipoSangre;
    private JLabel lblActor;
    private JTextField txtActor;
    private JLabel lblUrl;
    private JTextField txtUrl;
    private JLabel lblActualizar;
    private JTextField txtActualizar;
    private JLabel lblIdA;
    private JTextField txtIdA;
    private JLabel lblNombreA;
    private JTextField txtNombreA;
    private JLabel lblCasaA;
    private JTextField txtCasaA;
    private JLabel lblTipoSangreA;
    private JTextField txtTipoSangreA;
    private JLabel lblActorA;
    private JTextField txtActorA;
    private JLabel lblUrlA;
    private JLabel lblBorrar;
    private JTextField txtBorrar;
    private JLabel lblImagen;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JTable tablaA;
    private JScrollPane scroll;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;


    public VentanaA(String title) throws HeadlessException {
        super(title);
        this.setSize(900,900);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(118,208,204));
        lblId = new JLabel("ID:");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        lblNombre = new JLabel("Nombre del Personaje:");
        txtNombre = new JTextField(25);
        lblCasa = new JLabel("Casa a la que pertenece:");
        txtCasa = new JTextField(15);
        lblTipoSangre = new JLabel("Tipo de Sangre:");
        txtTipoSangre = new JTextField(15);
        lblActor = new JLabel("Actor que lo/la interpreta:");
        txtActor = new JTextField(25);
        lblUrl = new JLabel("URL de la Imagen:");
        txtUrl = new JTextField(50);
        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblCasa);
        panel1.add(txtCasa);
        panel1.add(lblTipoSangre);
        panel1.add(txtTipoSangre);
        panel1.add(lblActor);
        panel1.add(txtActor);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(204,125,85));
        btnCargar = new JButton("Cargar");
        tablaA = new JTable();
        scroll = new JScrollPane(tablaA);

        panel2.add(btnCargar);
        panel2.add(scroll);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(218,194,91));
        lblImagen = new JLabel("");

         panel3.add(lblImagen);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(157,84,218));
        lblActualizar = new JLabel("Rellene los siguientes campos para ctualizar a un Alumno, si el campo se desea mantener de la misma manera ingrese nuevamente el dato sin cambios.");
        lblIdA = new JLabel("ID del alumno a cambiar:");
        txtIdA = new JTextField(3);
        lblNombreA = new JLabel("Cambio del Nombre del Personaje:");
        txtNombreA = new JTextField(35);
        lblCasaA = new JLabel("Cambio de la Casa a la que pertenece:");
        txtCasaA = new JTextField(15);
        lblTipoSangreA = new JLabel("Cambio del Tipo de Sangre:");
        txtTipoSangreA = new JTextField(20);
        lblActorA = new JLabel("Cambio del Actor que lo/la interpreta:");
        txtActorA = new JTextField(30);
        lblUrlA = new JLabel("Cambio de la URL de la Imagen:");
        txtActualizar = new JTextField(60);
        btnActualizar = new JButton("Actualizar");
        lblBorrar = new JLabel("Borrar un Alumno:");
        txtBorrar = new JTextField(5);
        btnBorrar = new JButton("Borrar");

        panel4.add(lblActualizar);
        panel4.add(lblIdA);
        panel4.add(txtIdA);
        panel4.add(lblNombreA);
        panel4.add(txtNombreA);
        panel4.add(lblCasaA);
        panel4.add(txtCasaA);
        panel4.add(lblTipoSangreA);
        panel4.add(txtTipoSangreA);
        panel4.add(lblActorA);
        panel4.add(txtActorA);
        panel4.add(lblUrlA);
        panel4.add(txtActualizar);
        panel4.add(btnActualizar);
        panel4.add(lblBorrar);
        panel4.add(txtBorrar);
        panel4.add(btnBorrar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JLabel getLblCasa() {
        return lblCasa;
    }

    public void setLblCasa(JLabel lblCasa) {
        this.lblCasa = lblCasa;
    }

    public JTextField getTxtCasa() {
        return txtCasa;
    }

    public void setTxtCasa(JTextField txtCasa) {
        this.txtCasa = txtCasa;
    }

    public JLabel getLblTipoSangre() {
        return lblTipoSangre;
    }

    public void setLblTipoSangre(JLabel lblTipoSangre) {
        this.lblTipoSangre = lblTipoSangre;
    }

    public JTextField getTxtTipoSangre() {
        return txtTipoSangre;
    }

    public void setTxtTipoSangre(JTextField txtTipoSangre) {
        this.txtTipoSangre = txtTipoSangre;
    }

    public JLabel getLblActor() {
        return lblActor;
    }

    public void setLblActor(JLabel lblActor) {
        this.lblActor = lblActor;
    }

    public JTextField getTxtActor() {
        return txtActor;
    }

    public void setTxtActor(JTextField txtActor) {
        this.txtActor = txtActor;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JLabel getLblActualizar() {
        return lblActualizar;
    }

    public void setLblActualizar(JLabel lblActualizar) {
        this.lblActualizar = lblActualizar;
    }

    public JTextField getTxtActualizar() {
        return txtActualizar;
    }

    public void setTxtActualizar(JTextField txtActualizar) {
        this.txtActualizar = txtActualizar;
    }

    public JLabel getLblBorrar() {
        return lblBorrar;
    }

    public void setLblBorrar(JLabel lblBorrar) {
        this.lblBorrar = lblBorrar;
    }

    public JTextField getTxtBorrar() {
        return txtBorrar;
    }

    public void setTxtBorrar(JTextField txtBorrar) {
        this.txtBorrar = txtBorrar;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JTable getTablaA() {
        return tablaA;
    }

    public void setTablaA(JTable tablaA) {
        this.tablaA = tablaA;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JLabel getLblIdA() {
        return lblIdA;
    }

    public void setLblIdA(JLabel lblIdA) {
        this.lblIdA = lblIdA;
    }

    public JTextField getTxtIdA() {
        return txtIdA;
    }

    public void setTxtIdA(JTextField txtIdA) {
        this.txtIdA = txtIdA;
    }

    public JLabel getLblNombreA() {
        return lblNombreA;
    }

    public void setLblNombreA(JLabel lblNombreA) {
        this.lblNombreA = lblNombreA;
    }

    public JTextField getTxtNombreA() {
        return txtNombreA;
    }

    public void setTxtNombreA(JTextField txtNombreA) {
        this.txtNombreA = txtNombreA;
    }

    public JLabel getLblCasaA() {
        return lblCasaA;
    }

    public void setLblCasaA(JLabel lblCasaA) {
        this.lblCasaA = lblCasaA;
    }

    public JTextField getTxtCasaA() {
        return txtCasaA;
    }

    public void setTxtCasaA(JTextField txtCasaA) {
        this.txtCasaA = txtCasaA;
    }

    public JLabel getLblTipoSangreA() {
        return lblTipoSangreA;
    }

    public void setLblTipoSangreA(JLabel lblTipoSangreA) {
        this.lblTipoSangreA = lblTipoSangreA;
    }

    public JTextField getTxtTipoSangreA() {
        return txtTipoSangreA;
    }

    public void setTxtTipoSangreA(JTextField txtTipoSangreA) {
        this.txtTipoSangreA = txtTipoSangreA;
    }

    public JLabel getLblActorA() {
        return lblActorA;
    }

    public void setLblActorA(JLabel lblActorA) {
        this.lblActorA = lblActorA;
    }

    public JTextField getTxtActorA() {
        return txtActorA;
    }

    public void setTxtActorA(JTextField txtActorA) {
        this.txtActorA = txtActorA;
    }

    public JLabel getLblUrlA() {
        return lblUrlA;
    }

    public void setLblUrlA(JLabel lblUrlA) {
        this.lblUrlA = lblUrlA;
    }
}
