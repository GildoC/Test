package SobreCargaConstructores;


public class PersonaC {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorpersonas;
    
    private PersonaC(){
        this.idPersona = contadorpersonas++;
    }
    
    public PersonaC(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Persona { " + " idPerosna = " + idPersona + ", nombre = " + nombre + ", edad = " + edad + " } ";
    }
}