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
public class PruebaAritmetica {
    public static void main(String args[]){
        int operandoA = 6;
        int operandoB = 2;
        
        Aritmetica_V3 obj1 = new Aritmetica_V3(operandoA, operandoB);
        
        System.out.println("Operando A: " + operandoA + " y Operando B: " + operandoB);
        System.out.println("Resultado suma: " + obj1.sumar());
        System.out.println("Resultado resta: " + obj1.restar());
        System.out.println("Resultado multiplicacion: " + obj1.multiplicar());
        System.out.println("Resultado division: " + obj1.dividir());
        
        Aritmetica_V2 obj2 = new Aritmetica_V2(2, 1);
        
        System.out.println("Resultado suma atributos obj2 : " + obj2.sumar());
    }    
}
