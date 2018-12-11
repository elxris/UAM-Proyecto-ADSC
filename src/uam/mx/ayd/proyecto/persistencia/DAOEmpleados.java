package uam.mx.ayd.proyecto.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import uam.mx.ayd.proyecto.modelo.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elxris
 */
public class DAOEmpleados {

    public boolean altaEmpleado(Usuario usuario) {
        try {
            Statement st = ManejadorBD.dameConexion().createStatement();
            st.executeUpdate("INSERT INTO Usuarios (usuario, contrasena, nombre, rfc, telefono, isAdmin) VALUES ('"
                    + usuario.getUsuario() + "','" + usuario.getContrasena() + "','" + usuario.getNombre() + "','" + usuario.getRFC() + "','"
                    + usuario.getTelefono() + "'," + usuario.isAdmin() + ")");

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean bajaEmpleado(Usuario usuario) {
        try {
            Statement st = ManejadorBD.dameConexion().createStatement();
            st.executeUpdate("DELETE FROM Usuarios WHERE usuario = '" + usuario.getUsuario() + "'");

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean editaModelo(String usuarioAnterior, Usuario usuario) {
        try {
            Statement st = ManejadorBD.dameConexion().createStatement();
            st.executeUpdate("UPDATE Usuarios SET usuario = '" + usuario.getUsuario() + "',"
                    + "contrasena = '" + usuario.getContrasena() + "', nombre = '" + usuario.getNombre() + "',"
                    + "rfc = '" + usuario.getRFC() + "', telefono = '" + usuario.getTelefono() + "',"
                    + "isAdmin = " + usuario.isAdmin()
                    + " WERE usuario = '" + usuario + "'");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean verificaCredenciales(String usuario, String contrasena) {
        try {
            Statement st = ManejadorBD.dameConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Usuarios WHERE usuario = '"
                    + usuario + "', contrasena = '"
                    + contrasena + "'");
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Usuario recuperaEmpleado(int id) {
        try {
            Statement st = ManejadorBD.dameConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Usuarios WHERE IDUsuario = " + String.valueOf(id));
            if (rs.next()) {
                return new Usuario(rs.getInt("IDUsuario"), rs.getString("usuario"),
                        rs.getString("contrasena"), rs.getString("nombre"),
                        rs.getString("rfc"), rs.getString("telefono"),
                        rs.getBoolean("isAdmin"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Usuario[] dameEmpleados() {
           ArrayList<Usuario> list = new ArrayList<>();
        try {
            Statement st = ManejadorBD.dameConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Usuarios");
            while (rs.next()) {
                Usuario m = new Usuario(rs.getInt("IDUsuario"), rs.getString("usuario"),
                        rs.getString("contrasena"), rs.getString("nombre"), rs.getString("rfc"),
                        rs.getString("telefono"), rs.getBoolean("isAdmin"));
                list.add(m);
            }
            return list.toArray(new Usuario[list.size()]);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Usuario[0];
    }
}
