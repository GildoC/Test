package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{//En PersonaDAO se heredan todos los metodos creados en la Interfaz CRUD
    Conexion cn= new Conexion();    //debido a que la capa MODELO es la que interactua con la base de datos se debe crear el objeto conexion
    Connection con;     //variable del tipo connection para operar con la BD
    PreparedStatement ps;       //Variable del tipo PreparedStatement que ejecutara la sentencia SQL creada
    ResultSet rs;           //Variable que contendra el resultado devuelto por la BD luego de la ejecucion de la sentencia
    Persona p = new Persona();      //Variable persona a utilizar con los atributos de la tabla persona tanto para consultas como modificacion y resultados.
    
    
    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();       //Utilizaremos un ArrayList del tipo persona para almacenar los datos recibidos de la bd luego de la consulta
        String sql = "Select * from persona";       //Creamos la consulta de listar que va traer todos los registros existentes
        try {
            con = cn.getConnection();       //Generamos la conexion con la base de datos
            ps = con.prepareStatement(sql);     //Ejecutamos con el PreparedStatement la consulta definida en SQL
            rs = ps.executeQuery();         //Almacenamos en el ResultSet "rs" el resultado del PreparedStatement ejecutado
            while (rs.next()){      //usamos un while para recorrer el resultset
                Persona per = new Persona();        //creamos una nueva variable del tipo Persona para ir volcando los datos
                per.setId(rs.getInt("Id"));         //en la variable per seteamos el Id como esta en el valor actual de rs segun el resultado de la BD**el texto dentro del rs.getInt debe ser igual al campo de la BD
                per.setDni(rs.getInt("DNI"));       //Lo mismo que el de arriba
                per.setNom(rs.getString("Nombres"));        //Lo mmismo que lo de arriba
                list.add(per);          //Agregamos a la lista LIST del Arraylist con el objeto "per" con los valores actual de esta lectura de resultset
            }
        } catch (Exception e) {
        }
        return list;        //Finalmente se retorna la lista del arraylist con los valores obtenidos y guardados en LIST luego de la consulta
    }

    @Override
    public Persona list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Persona per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
