/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.SQLException;

/**
 *
 * @author Gildo
 */
public class Consultas extends Conexion{            //extiende de Conexion que creamos recien para la conexion a la base de datos para heredar todas sus propiedades
    public boolean Autenticacion(String user, String pass) throws SQLException
    {
        Statement st = con.createStatement();   //crea la sentencia para poder hacer luego la consulta a la bd
        ResultSet rs = null;                    // resulset es la manera de utilizar la sentencia de consulta
        String Consulta = "Select * from Usuarios";  //se crea el string de la consulta o sql a realizar
        rs = st.executeQuery(Consulta);             // se carga el resulset creado
        while(rs.next())
        {
            if (user.equals(rs.getString("Usuario")) && pass.equals((rs.getString("Contrasena"))))
                return true;
        }        
        return false;
    }
    
    
}
