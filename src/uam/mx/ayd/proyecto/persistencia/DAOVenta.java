package uam.mx.ayd.proyecto.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import uam.mx.ayd.proyecto.modelo.Venta;

/**
 *
 * @author Omar JRZ
 */
public class DAOVenta {

    public Venta agregaVenta(String nombre, String fecha, int cantidad, double precio, double total) {
        try {
            Statement st = ManejadorBD.dameConexion().createStatement();
            st.executeUpdate("INSERT INTO Ventas VALUES (IDVenta, nombre, fecha, cantidad, precio, total)"
                    + "VALUES ('" + nombre + "','" + fecha + "'," + cantidad + "," + precio + ","
                    + total + ")");
            return new Venta(nombre, fecha, cantidad, precio, total);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
//        con.getConexion();
//        ResultSet venta =con.agregaVenta( nombre,fecha, cantidad, precio, total); 
//        return null;
    }

    /**
     * Recupera un arreglo de producto
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<String> recuperaVentas() throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        try {
            Statement st = ManejadorBD.dameConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Ventas");
            while (rs.next()) {

                list.add(rs.getString("nombre"));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
