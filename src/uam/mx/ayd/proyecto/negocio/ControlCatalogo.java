package uam.mx.ayd.proyecto.negocio;

import uam.mx.ayd.proyecto.Aplicacion;
import uam.mx.ayd.proyecto.modelo.Modelo;
import uam.mx.ayd.proyecto.persistencia.DAOModelos;
import uam.mx.ayd.proyecto.presentacion.VentanaAdministrarCatalogo;
import uam.mx.ayd.proyecto.presentacion.VentanaAltaModelo;
import uam.mx.ayd.proyecto.presentacion.VentanaBajaModelo;
import uam.mx.ayd.proyecto.presentacion.VentanaEditaModelo;

public class ControlCatalogo {
    private DAOModelos dao;
    private Aplicacion app;
    
    public ControlCatalogo(DAOModelos dao){
        this.dao = dao;
    }
    
    public void ventanaAdministrarC() {
        VentanaAdministrarCatalogo ventanaAC = new VentanaAdministrarCatalogo(this);
        ventanaAC.setVisible(true);
    }
    
    public void ventanaAlta(){
        VentanaAltaModelo ventanaA = new VentanaAltaModelo(this);
        ventanaA.setVisible(true);
    }
    
    public void ventanaEdita(){
        VentanaEditaModelo ventanaE = new VentanaEditaModelo(this);
        ventanaE.setVisible(true);
    }
    
    public void ventanaBaja(){
        VentanaBajaModelo ventanaB = new VentanaBajaModelo(this);
        ventanaB.setVisible(true);
    }
    
    public boolean altaModelo(int id, String descripcion, double precio, String color, String talla, int piezas, String regla) {
        Modelo m = new Modelo(id, descripcion, precio, color, talla, piezas, regla);
        if(!dao.altaModelo(m))
            return true;
        return false;
    }

    public Modelo buscaModelo(int id) {
        Modelo m;
        m = dao.buscaModelo(id);
        
        return m;
    }
    public double damePrecio (int id){
        Modelo m;
        m = this.buscaModelo(id);
        double precio = m.getPrecio();
        return precio;
    }

    public boolean bajaModelo(int id) {
        dao.bajaModelo(id);
        return true;
    }

    public boolean editaModelo(int id, String descripcion, double precio, String color, String talla, int piezas, String regla, int id2) {
        if(!dao.editaModelo(id, descripcion, precio, color, talla, piezas, regla, id2))
            return true;
        return false;
                    
    }

    public void defineRegla(Modelo m, String regla) {
        dao.defineRegla(m, regla);
    }

    

    

    
}
