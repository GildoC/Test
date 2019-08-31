/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;


public class Persona {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    
    public Persona (){
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public void desplegarNombre(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido Paterno : " + apellidoPaterno);
        System.out.println("Apellido Materno : " + apellidoMaterno);
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    public void cambiarNombre(String cad){
        this.nombre = cad;
    }
}
