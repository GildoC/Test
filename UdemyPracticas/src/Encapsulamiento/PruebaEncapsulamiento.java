/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

import Encapsulamiento.PersonaE;

public class PruebaEncapsulamiento {
    public static void main(String[] args){
        //creamos el objeto
        PersonaE p1 = new PersonaE("Juan", "Perez", false);
        //Accedemos al atributo nombre
        System.out.println("Nmobre de p1: " + p1.getNombre());
        
        //creamos el objeto
        PersonaE p2 = new PersonaE("Karla", "Gonzalez", false);
        //imprimimos el estado completo del ojeto
        System.out.println("Estado objeto p2: " + p2);
        
        //Marcamos como eliminada la persona
        p2.setBorrado(true);
        //Imprimimos el estado completo del objeto
        System.out.println("Estado objeto p2" + p2);
        // creamos un tercer objeto vacio
        PersonaE p3 = new PersonaE();
        //Imprimimos el estado completo del objeto 
        System.out.println("Estado objeto p3: " + p3);
    }
    
}
