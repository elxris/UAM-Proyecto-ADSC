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
