/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;

public class CicloWhileV2 {
    public static void main(String[] args){
        System.out.println("por favor introduce el numero de elementos a iterar");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in);
        maxElementos = entradaEscaner.nextInt();
        int contador = 0;
        while (contador < maxElementos){
            System.out.println("contador = " + contador);
            contador++;
        }
    }
}
