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
public class Empleado extends Usuario {

    public Empleado(String usuario, String contrasena, String nombre, String RFC, String telefono) {
        super(usuario, contrasena, nombre, RFC, telefono, false);
    }

    public Empleado(int id, String usuario, String contrasena, String nombre, String RFC, String telefono) {
        super(id, usuario, contrasena, nombre, RFC, telefono, false);
    }

}
