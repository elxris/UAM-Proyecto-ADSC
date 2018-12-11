/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.mx.ayd.proyecto.modelo;

/**
 *
 * @author elxris
 */
public class Administrador extends Usuario{

    public Administrador(String idEmpleado, String contrasena, String nombre, String RFC, String telefono) {
        super(idEmpleado, contrasena, nombre, RFC, telefono, true);
    }
    
}
