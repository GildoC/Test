
package UsoStatic;


public class PersonaS {
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;
    
    public PersonaS(String nombre){
        //Cada que creamos un objeto persona incrementamos el contador para obtener un nuevo idPersona
        contadorPersonas++;
        //asignamos el nuevo valor al idPersona
        idPersona = contadorPersonas;
        //asignamos el nombre recibido
        this.nombre = nombre;
    }
    
    public String toString(){
        return "persona [idPersona: " + idPersona + ", nombre: " + nombre + "]";
    }
    
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
}
