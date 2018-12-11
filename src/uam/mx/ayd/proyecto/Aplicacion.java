/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.mx.ayd.proyecto;

import uam.mx.ayd.proyecto.negocio.ControlCatalogo;
import uam.mx.ayd.proyecto.negocio.ControlEmpleados;
import uam.mx.ayd.proyecto.negocio.ControlRevisionInventario;
import uam.mx.ayd.proyecto.persistencia.DAOEmpleados;
import uam.mx.ayd.proyecto.persistencia.DAOModelos;
import uam.mx.ayd.proyecto.presentacion.VentanaAdministrarCatalogo;
import uam.mx.ayd.proyecto.presentacion.VentanaCantidadPrecio;
import uam.mx.ayd.proyecto.presentacion.VentanaPrincipal;

/**
 *
 * @author elxris
 */
public class Aplicacion {
    
    DAOModelos modelos;
    DAOEmpleados empleados;
    ControlCatalogo controlC;
    
    public static void main(String [] args){
        Aplicacion app = new Aplicacion();
        
        app.inicia();
    }
    
    public Aplicacion() {
        modelos = new DAOModelos();
        empleados = new DAOEmpleados();
    }
    
    public void inicia() {
        VentanaPrincipal ventana = new VentanaPrincipal(this);
        ventana.setVisible(true);
    }
    
    public void abreRevisionInventario() {
        ControlRevisionInventario control = new ControlRevisionInventario(modelos);
    }

    
    public void AdministrarCatalogo() {
        VentanaAdministrarCatalogo ventanaAC = new VentanaAdministrarCatalogo(controlC);
        ventanaAC.setVisible(true);
    }

    public void definePrecioCantidad() {
        VentanaCantidadPrecio ventanaCP = new VentanaCantidadPrecio(controlC);
        ventanaCP.setVisible(true);
    }

    public void verificaDatos(String usuario, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void abreAdministrarEmpleados() {
        ControlEmpleados control = new ControlEmpleados(empleados);
        control.despliegaVentanaAdministrarUsuarios();
    }
    
}
