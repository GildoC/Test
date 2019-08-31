package UsoHerencia;

public class PersonaH {

    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    public PersonaH(){}
    
    public PersonaH(String nombre){
        this.nombre = nombre;
    }
    
    public PersonaH(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;   //M-Masculino; F-Femenino
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public char getGenero(){
        return genero;
    }
    
    public void setGenero(char genero){
        this.genero = genero;
    }

    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "PersonaH{ " + " nombre = " + nombre + ", genero = " + genero + ", edad = " + edad + ", direccion = " + direccion + " } ";
    }
}