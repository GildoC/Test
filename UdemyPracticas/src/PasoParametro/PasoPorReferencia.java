/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasoParametro;


import Objetos.Persona;

public class PasoPorReferencia {
    public static void main(String[] args){
        Persona p = new Persona();
        p.cambiarNombre("Juan");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
    
    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("Carlos");
    }
    
    public static void imprimirNombre(Persona p){
        System.out.println("Valor recibido: " + p.obtenerNombre());
    }
    
}

