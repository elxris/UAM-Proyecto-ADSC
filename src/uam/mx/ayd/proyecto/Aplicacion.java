/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.mx.ayd.proyecto;

import uam.mx.ayd.proyecto.negocio.ControlRevisionInventario;
import uam.mx.ayd.proyecto.persistencia.DAOModelos;
import uam.mx.ayd.proyecto.presentacion.VentanaPrincipal;

/**
 *
 * @author elxris
 */
public class Aplicacion {
    
    DAOModelos modelos;
    
    public static void main(String [] args){
        Aplicacion app = new Aplicacion();
        
        app.inicia();
    }
    
    public Aplicacion() {
        modelos = new DAOModelos();
    }
    
    public void inicia() {
        VentanaPrincipal ventana = new VentanaPrincipal(this);
        ventana.setVisible(true);
    }
    
    public void abreRevisionInventario() {
        ControlRevisionInventario control = new ControlRevisionInventario(modelos);
    }
}
