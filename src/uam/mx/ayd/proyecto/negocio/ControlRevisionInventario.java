/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.mx.ayd.proyecto.negocio;

import uam.mx.ayd.proyecto.persistencia.DAOModelos;
import uam.mx.ayd.proyecto.presentacion.VentanaRevisionInventario;

/**
 *
 * @author elxris
 */
public class ControlRevisionInventario {
    
    DAOModelos modelos;

    public ControlRevisionInventario(DAOModelos dao) {
        this.modelos = dao;
        inicia();
    }
    
    public void inicia() {
        VentanaRevisionInventario ventana = new VentanaRevisionInventario(this);
        ventana.setVisible(true);
    }
    
}
