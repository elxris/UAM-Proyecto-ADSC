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
            st.execute("insert into Modelos values(" + m.getId() + ",'" + m.getDescripcion() + "'," + 
                    m.getPrecio() + ",'" + m.getColor() + "'," + m.getTalla() + "'," + m.getNumeropzs() + m.isOferta() + ")");
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean editaModelo(){
        
        return true;
    }
    
    public boolean bajaModelo(Modelo m){
        int resultado = 0;
        try{
            Statement st = ManejadorBD.dameConexion().createStatement();
            resultado = st.executeUpdate("DELETE FROM Modelos WHERE IDmodelo = '" + m.getId() + 
                    "' AND descripcion = '" + m.getDescripcion() + "' AND precio = '" + m.getPrecio() +
                    "' AND color = '" + m.getColor() + "' AND talla = '" + m.getTalla() +
                    "' AND numeropzs = '" + m.getNumeropzs() + "' AND oferta = '" + m.isOferta() + "'");
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
                rs.getString("color"), rs.getString("talla"), rs.getInt("piezas"), rs.getBoolean("oferta"));
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return m;
    }
    
}
