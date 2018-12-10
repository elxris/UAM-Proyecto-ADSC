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
            statement.execute("create table Medelos(IDmodelo INTEGER PRYMARY KEY not null, "
                    + "descripcion varchar (40), precio double, color varchar(20), "
                    + "talla varchar(10), piezas int, oferta boolean)");
            System.out.println("Taba Modelos creada");
            ManejadorBD.termina();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
/**
 * try{
            Connection connection = ManejadorBD.dameConnection();
            Statement statement = connection.createStatement();
            statement.execute("create table Autores(autorID INTEGER PRIMARY KEY not null GENERATED ALWAYS AS IDENTITY (START WHIT 1, INCREMENT BY 1), nombre varchar(40), apellido varchar(40), anio int)"); // CONSTRAINT primaty_key PRIMATY KEY (autorId)
            System.out.println("Tabla de Autores creada exitosamente");
            statement.execute("create table Libros(nombre varchar(40), precio double precision, autor int)");
            System.out.println("Tabla de Libros creada exitosamente");
            statement.execute("create table Revistas(nombre varchar(40), precio double precision, numero int)");
            System.out.println("Tabla de Revistas creada exitosamente");
            ManejadorBD.termina();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        * 
        * String tabla = "create table Usuarios (ID INT PRIMARY KEY, Nombre varchar(50),"
                        + "Apellido Varchar(50), Color Varchar(50) )";
                PreparedStatement ps = con.prepareStatement(tabla);
                ps.execute();
                ps.close();
        
 */
