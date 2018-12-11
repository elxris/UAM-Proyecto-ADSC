package uam.mx.ayd.proyecto.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import uam.mx.ayd.proyecto.modelo.Modelo;

/**
 *
 * @author Omar JRZ
 */
public class DAOModelos {
    
    public boolean altaModelo(Modelo m){
        try{
            Statement st = ManejadorBD.dameConexion().createStatement();
            st.executeUpdate("INSERT INTO Modelos VALUES (IDmodelo, descripcion, precio, color, talla, piezas, reglaventa)"
                    + "VALUES ("+m.getId()+",'"+ m.getDescripcion()+"',"+m.getPrecio()+",'"+m.getColor()+"','" + 
                            m.getTalla()+"',"+m.getNumeropzs()+",'"+m.getReglaventa()+"')"); 
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean editaModelo(int id, String descripcion, double precio, String color, String talla, int piezas, String regla, int id2) {
        try{
            Statement st = ManejadorBD.dameConexion().createStatement();
            st.executeUpdate("UPDATE Modelos SET IDmodelo = "+id+",descripcion = '"+descripcion+"',precio = "+precio+",color = '"+
                    color+"',talla = '"+talla+"',piezas = "+piezas+",reglaventa = "+regla+" WHERE IDModelo = "+id2);
            
            //ResultSet rs = st.executeQuery("UPDATE Modelos SET IDmodelo = " + id + 
            //        ", descripcion = '" + descripcion + ", precio = " + precio + 
            //        ", color = '" + color + ", talla = '" + talla + ", piezas = " + piezas + 
            //        ", oferta = " + oferta + "WHERE IDmodelo = " + id);
            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean bajaModelo(Modelo m){
        int resultado = 0;
        try{
            Statement st = ManejadorBD.dameConexion().createStatement();
            resultado = st.executeUpdate("DELETE FROM Modelos WHERE IDmodelo = '" + m.getId() + 
                    "' AND descripcion = '" + m.getDescripcion() + "' AND precio = '" + m.getPrecio() +
                    "' AND color = '" + m.getColor() + "' AND talla = '" + m.getTalla() +
                    "' AND numeropzs = '" + m.getNumeropzs() + "' AND reglaventa = '" + m.getReglaventa()+ "'");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        if(resultado == 0)
            return false;
        else
            return true;
    }
    
    public boolean bajaModelo(int id){
        try{
            Statement st = ManejadorBD.dameConexion().createStatement();
            ResultSet rs = st.executeQuery("DELETE * FROM Modelos WHERE IDModelo = " + id);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return true;
    }
    
    public int cuantosModelos(){
        try{
            Statement st = ManejadorBD.dameConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT (*) FROM Modelos");
            if(rs.next())
                return rs.getByte(1);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    public Modelo buscaModelo(int id) {
        Modelo m = null;
        try{
            Statement st = ManejadorBD.dameConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Modelos WHERE IDmodelo = " + id);
            if(rs.next())
                m = new Modelo(rs.getInt("IDmodelo"), rs.getString("descripcion"), rs.getInt("precio"),
                rs.getString("color"), rs.getString("talla"), rs.getInt("piezas"), rs.getString("reglaventa"));
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return m;
    }

    public void defineRegla(Modelo m, String regla) {
        try{
            Statement st = ManejadorBD.dameConexion().createStatement();
            st.executeUpdate("UPDATE Modelos SET reglaventa = "+regla+" WHERE IDmodelo = " + m.getId());
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }

    
}
