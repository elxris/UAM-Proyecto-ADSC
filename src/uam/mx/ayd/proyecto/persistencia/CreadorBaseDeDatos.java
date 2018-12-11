package uam.mx.ayd.proyecto.persistencia;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Omar JRZ
 */
public class CreadorBaseDeDatos {
    public static void main(String[] args) {
        try{
            Connection conexion = ManejadorBD.dameConexion();
            Statement statement = conexion.createStatement();
            statement.execute("create table Modelos(IDmodelo INTEGER PRIMARY KEY not null, "
                    + "descripcion varchar(40), precio double, color varchar(20), "
                    + "talla varchar(10), piezas int, reglaventa varchar(30))");
            System.out.println("Taba Modelos creada");
            statement.execute("create table Usuarios(IDUsuario INTEGER PRIMARY KEY not null "
                    + "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
                    + "usuario varchar(40), contrasena varchar(40), nombre varchar(40),"
                    + "rfc varchar(40), telefono varchar(40), isAdmin boolean)");
            System.out.println("Tabla Usuarios creada");
            statement.execute("create table Ventas(IDVenta INTEGER PRIMARY KEY not null "
                    + "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    + "nombre varchar(40), fecha varchar(15), cantidad double, precio double, total double)");
            System.out.println("Tabla Ventas creada");
            //statement.execute("create table Ventas(ID venta INTEGER PRYMARY KEY not null,"        + "")
            ManejadorBD.termina();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
