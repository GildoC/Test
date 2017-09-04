/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;


import java.sql.DriverManager;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection; //para que salga el error se debe descargar el mysqljdbc de la pagina mysql y connector/j
import java.sql.SQLException;

public class Conexion{

    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String HOST = "LOCALHOST";
    public static final String PORT = "3306";
    public static final String DATABASE = "codigofacilito";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+ HOST + ":" + PORT + "/" + DATABASE;
    
    public java.sql.Connection con;

    
    public  Conexion()
    {   
        try
        {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch (ClassNotFoundException e){
            System.out.println("Error");
        }catch (SQLException e){
            System.out.println("Error");
        }
    }
    
    public static void main (String[] args)
    {
        Conexion con = new Conexion ();
    }
    
}
