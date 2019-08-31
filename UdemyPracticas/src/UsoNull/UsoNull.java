/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsoNull;

import Objetos.Persona;
public class UsoNull{
    
    public static void main(String[] args){
        Persona p1 = new Persona("Juan");
        System.out.println("Nombre p1: " + p1.obtenerNombre());
        
        Persona p2 = p1;
        System.out.println("Nombre p2" + p2.obtenerNombre());
        
        p1 = null;
        if(p1 != null){
            System.out.println("Nombre p1 if: "+ p1.obtenerNombre());
        }
        
        System.out.println("Nombre p2" + p2.obtenerNombre());
    }
    
}
