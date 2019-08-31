/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

/**
 *
 * @author Gildo
 */
public class CicloWhile {
    public static void main(String[] args){
        int contador = 0;
        int limite = 10;
        while (contador < limite){
            System.out.println("Contador = "+ contador);
            contador++;
        }
    }
}
