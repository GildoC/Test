package Arreglos;


public class PersonaA {
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    private String nombre2;
    
    public PersonaA(){}
    
    public PersonaA(String nombre){
        this.nombre = nombre;
    }
    
    
    public PersonaA(String nombre, String nombre2){
        this.nombre = nombre;
        this.nombre2 = nombre2;
    }
    
    public PersonaA(String nombre, char genero, int edad, String direccion){
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
    
    public void setNombre2(String nombre2){
        this.nombre2 = nombre2;
    }
    
    public String getNombre2(){
        return nombre2;
    }
    
    @Override
    public String toString(){
        return "PersonaA{ " + " nombre = " + nombre + ", genero = " + genero + ", edad = " + edad + ", direccion = " + direccion + " nombre2 " + nombre2 +" } ";
    }
}