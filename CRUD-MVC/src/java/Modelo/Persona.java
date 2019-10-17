
package Modelo;

//debe reflejar los datos de persona en la base de datos

public class Persona {
    int id;
    int dni;
    String nom;

    public Persona() {
    }

    public Persona(int dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
