/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author Gildo
 */
public class PersonaE {
    
    private String nombre;
    private String apellido;
    private boolean borrado;
    
    public PersonaE(){
    }
    
    public PersonaE(String nombre, String apellido, boolean borrado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public boolean getBorrado(){
        return borrado;
    }
    
    public void setBorrado(boolean borrado){
        this.borrado = borrado;
    }
    
    @Override
    public String toString(){
        return " Persona{ " + "nombre = " + nombre + " apellido = " + apellido + " borrado = " + borrado +'}';
    }
}
