package uam.mx.ayd.proyecto.negocio;

import uam.mx.ayd.proyecto.modelo.Modelo;
import uam.mx.ayd.proyecto.persistencia.DAOModelos;
import uam.mx.ayd.proyecto.presentacion.VentanaAltaModelo;

public class ControlCatalogo {
    private DAOModelos dao;
    
    public ControlCatalogo(DAOModelos dao){
        this.dao = dao;
    }
    
    public void ventanaAlta(){
        VentanaAltaModelo ventanaA = new VentanaAltaModelo(this);
        ventanaA.setVisible(true);
    }
    
    public boolean altaModelo(int id, String descripcion, double precio, String color, String talla, int piezas, boolean oferta) {
        Modelo m = new Modelo(id, descripcion, precio, color, talla, piezas, oferta);
        if(!dao.altaModelo(m))
            return true;
        return false;
    }

    public Modelo buscaModelo(int id) {
        Modelo m;
        m = dao.buscaModelo(id);
        
        return null;
    }
}
