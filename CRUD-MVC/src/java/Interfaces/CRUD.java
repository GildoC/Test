package Interfaces;

import Modelo.Persona;
import java.util.List;


public interface CRUD{ 
    //se crean los metodos para las distintas funcinoes a implementar recibiendo el parametro correspondiente.
    public List listar();
    public Persona list(int id);
    public boolean add(Persona per);
    public boolean edit(Persona per);
    public boolean eliminar(int id);
}
    

