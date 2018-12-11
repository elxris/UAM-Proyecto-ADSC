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
public class Usuario {

    int id;
    String usuario;
    String contrasena;
    String nombre;
    String RFC;
    String telefono;
    boolean isAdmin;

    public Usuario(String usuario, String contrasena, String nombre, String RFC, String telefono, boolean isAdmin) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.RFC = RFC;
        this.telefono = telefono;
        this.isAdmin = isAdmin;
    }

    public Usuario(int id, String usuario, String contrasena, String nombre, String RFC, String telefono, boolean isAdmin) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.RFC = RFC;
        this.telefono = telefono;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
