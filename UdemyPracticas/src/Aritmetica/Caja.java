/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

/**
 *
 * @author Gildo
 */
public class Caja {
    
    private int ancho;
    private int alto;
    private int profundo;
    
    public Caja(){
    
    }
    
    public Caja(int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    public int calcularVolumen(){
        return ancho*alto*profundo;
    }
    
    public int calcularVolumen(int alto, int ancho, int profundo){
        return alto*ancho*profundo;
    }
    
}
