package Matriz;

public class PersonaM {
    private String nombre;
    
    PersonaM(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString(){
        return "Persona { " + "nombre = " + getNombre() + " } ";
    }    
}
