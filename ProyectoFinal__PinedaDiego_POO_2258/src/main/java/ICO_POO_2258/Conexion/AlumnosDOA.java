package ICO_POO_2258.Conexion;

import ICO_POO_2258.Modelo.AlumnoHogwarts;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AlumnosDOA implements InterfasDAO{
    public AlumnosDOA() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsertar = "INSERT INTO AlumnosH(Nombre, Casa, TipoSangre, ActorInterprete, URLFoto) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("AlumnosHogwartsDB.db").getConnection().prepareStatement(sqlInsertar);
        pstm.setString(1,((AlumnoHogwarts)obj).getNombre());
        pstm.setString(2,((AlumnoHogwarts)obj).getCasa());
        pstm.setString(3,((AlumnoHogwarts)obj).getTipoSangre());
        pstm.setString(4,((AlumnoHogwarts)obj).getActor());
        pstm.setString(5,((AlumnoHogwarts)obj).getUrl());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE AlumnosH SET Nombre = ?, Casa = ?, TipoSangre = ?, ActorInterprete = ?, URLFoto = ? WHERE ID = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("AlumnosHogwartsDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((AlumnoHogwarts)obj).getNombre());
        pstm.setString(2,((AlumnoHogwarts)obj).getCasa());
        pstm.setString(3,((AlumnoHogwarts)obj).getTipoSangre());
        pstm.setString(4,((AlumnoHogwarts)obj).getActor());
        pstm.setString(5,((AlumnoHogwarts)obj).getUrl());
        pstm.setInt(6,((AlumnoHogwarts)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlBorrar = "DELETE FROM AlumnosH WHERE ID = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("AlumnosHogwartsDB.db").getConnection().prepareStatement(sqlBorrar);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sqlObtener = "SELECT * FROM AlumnosH";
        ArrayList<AlumnoHogwarts> resultado = new ArrayList<>();
            Statement stm = ConexionSingleton.getInstance("AlumnosHogwartsDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sqlObtener);
            while (rst.next()){
                resultado.add(new AlumnoHogwarts(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
            }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sqlBuscar = "SELECT * FROM AlumnosH WHERE ID = ? ;";
        AlumnoHogwarts alu = null;
            PreparedStatement pstm = ConexionSingleton.getInstance("AlumnosHogwartsDB.db").getConnection().prepareStatement(sqlBuscar);
            pstm.setInt(1,Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if (rst.next()){
                alu = new AlumnoHogwarts(rst.getInt(1) , rst.getString(2) , rst.getString(3) , rst.getString(4) , rst.getString(5) , rst.getString(6));
            }
        return alu;
    }
}
