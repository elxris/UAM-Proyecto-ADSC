package uam.mx.ayd.proyecto.persistencia;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar JRZ
 */
public class ManejadorBD {
    private static ManejadorBD manejador = null;
    // Informacion del driver
    private static String framework = "embedded";
    private static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static String protocol = "jdbc:derby:";
    
    private String nombreBD = "BaseDeDatosModelo"; // nombre de la base de datos
    private String barra = File.separator;
    private String proyecto = System.getProperty("user.dir") + barra + nombreBD;
    File url = new File(proyecto);
    
    private Connection conexion = null;
    
    private ManejadorBD() throws DatabaseException{
        try{
        Class.forName(driver).newInstance();
        String db = protocol + proyecto + ";create = true";
        conexion = DriverManager.getConnection(db);
        conexion.setAutoCommit(true);
        }
        catch(Exception E){
            E.printStackTrace();
            throw new DatabaseException("Problema al levantar la base de datos :(", E);
        }
    }
    
    public static Connection dameConexion() throws DatabaseException{
        if(manejador == null){
            manejador = new ManejadorBD();
            System.out.println("El manejador ha sido creado");
        }
        return manejador.conexion;
    }
    
    public static void termina(){
        System.out.println("Apagado la base de datos......");
        if(manejador == null){
            return;
        }
        try{
            manejador.conexion.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        boolean gotSQLExc = false;
        
        if(framework.equals("embedded")){
            try{
                DriverManager.getConnection(protocol + ";shutdown = true");
            }
            catch(SQLException se){
                gotSQLExc = true;
            }
            if(!gotSQLExc)
                System.out.println("La base de datos no se apago de forma normal");
            else
                System.out.println("La base de datos se apago de forma normal");
            
        }
    }    
}
