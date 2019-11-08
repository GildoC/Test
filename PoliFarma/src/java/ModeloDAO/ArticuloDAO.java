package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArticuloDAO implements CRUD{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Articulo a = new Articulo();
    

    @Override
    public List listar() {
        ArrayList<Articulo>list = new ArrayList<>();
        String sql = "Select * from inventario";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Articulo art = new Articulo();
                art.setId(rs.getInt("id"));
                art.setPos(rs.getInt("pos"));
                art.setTraer(rs.getString("traer"));
                art.setLlevar(rs.getString("llevar"));
                art.setEstado(rs.getString("estado"));
                art.setNombre(rs.getString("nombre"));
                art.setDescripcion(rs.getString("descripcion"));
                art.setCantidad(rs.getInt("cantidad"));
                art.setFoto(rs.getString("foto"));
                list.add(art);
            }
        }catch (Exception e){
            
        }
        return list;
    }

    @Override
    public Articulo list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Articulo art) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Articulo art) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
