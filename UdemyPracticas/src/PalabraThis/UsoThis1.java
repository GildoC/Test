/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalabraThis;

/**
 *
 * @author Gildo
 */
public class UsoThis1 {
    public static void main(String[] args){
        Persona p = new Persona("Juan");
    }
}

class Persona{
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre; //this es el objeto Persona(actual)
        
        //Imprimimos el objeto persona
        
        Imprimir i = new Imprimir();
        i.imprimir(this);
    }
}

class Imprimir{
    public void imprimir (Object o ){
        System.out.println("Imprimir parametro: " + o);// el parametro es el objeto persona recibido mediante el THIS en persona
        System.out.println("Imprimir objeto actual (this): "+ this); // this ahora apunta al objeto imprimir
    }
}
