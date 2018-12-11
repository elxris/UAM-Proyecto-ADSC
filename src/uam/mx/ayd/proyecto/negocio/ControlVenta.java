package uam.mx.ayd.proyecto.negocio;
import java.sql.SQLException;
import uam.mx.ayd.proyecto.modelo.Venta;
import uam.mx.ayd.proyecto.persistencia.DAOVenta;
import uam.mx.ayd.proyecto.presentacion.VentanaRealizaVenta;

/**
 *
 * @author Omar JRZ
 */
public class ControlVenta {
    DAOVenta daoventa;
    Venta venta;
    
    public ControlVenta(DAOVenta daoventa){
        this.daoventa=daoventa;
    }//constructor de la clase controlventa
    
    public void inicia(){
        VentanaRealizaVenta ventanita= new VentanaRealizaVenta(this);
        ventanita.setVisible(true);
    }
    public Venta agregaVenta(String nombre,String fecha,int cantidad,double precio,double total) throws SQLException{
        venta = daoventa.agregaVenta(nombre, fecha, cantidad, precio, total);
        return venta;
        
    }

    void VentanaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Venta agregaVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
