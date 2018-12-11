/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.mx.ayd.proyecto.negocio;

import uam.mx.ayd.proyecto.persistencia.DAOEmpleados;
import uam.mx.ayd.proyecto.modelo.Usuario;
import uam.mx.ayd.proyecto.presentacion.VentanaAdministrarUsuarios;
import uam.mx.ayd.proyecto.presentacion.VentanaAltaEmpleado;

/**
 *
 * @author elxris
 */
public class ControlEmpleados {

    DAOEmpleados dao;
    Usuario usuario;

    public ControlEmpleados(DAOEmpleados dao) {
        this.dao = dao;
    }

    public boolean altaEmpleado(String usuario, String nombre, String contrasena, String rfc, String telefono, boolean isAdmin) {
        Usuario nuevoUsuario = new Usuario(usuario, contrasena, nombre, rfc, telefono, isAdmin);
        return dao.altaEmpleado(nuevoUsuario);
    }
    
    public boolean bajaEmpleado(Usuario usuario) {
        return dao.bajaEmpleado(usuario);
    }
    
    public boolean ediaEmpleado(String usuarioAnterior, Usuario usuario) {
        return dao.editaModelo(usuarioAnterior, usuario);
    }

    public void despliegaVentanaAltaEmpleado() {
        usuario = new Usuario("", "", "", "", "", false);
        VentanaAltaEmpleado ventana = new VentanaAltaEmpleado(this);
        ventana.setVisible(true);
    }
    
    public void despliegaVentanaBajaEmpleado() {
        
    }
    
    public void despliegaVentanaEditaEmpleado() {
        
    }
    
    public void despliegaVentanaAdministrarUsuarios () {
        VentanaAdministrarUsuarios ventana = new VentanaAdministrarUsuarios(this);
        ventana.setVisible(true);
    }
    
    public boolean validaFormularioAlta (String usuario, String nombre, String contrasena, String rfc, String telefono) {
        if (usuario.isEmpty() || nombre.isEmpty() || contrasena.isEmpty() || rfc.isEmpty() || telefono.isEmpty()) {
            return false;
        }
        return true;
    }
}
