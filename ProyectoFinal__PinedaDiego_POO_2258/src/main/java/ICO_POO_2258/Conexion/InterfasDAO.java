package ICO_POO_2258.Conexion;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfasDAO {
    public abstract boolean insertar(Object obj) throws SQLException;
    public abstract boolean update(Object obj) throws SQLException;
    public abstract boolean delete(String id) throws SQLException;
    public abstract ArrayList obtenerTodo( ) throws SQLException;
    public abstract Object buscarPorId(String id) throws SQLException;
}
