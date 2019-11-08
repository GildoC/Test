package Interfaces;

import Modelo.Articulo;
import java.util.List;

public interface CRUD {
    public List listar();
    public Articulo list (int id);
    public boolean add(Articulo art);
    public boolean edit (Articulo art);
    public boolean eliminar (int id);
}
