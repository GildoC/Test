/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Return;

/**
 *
 * @author Gildo
 */
public class ReturnPrimitivo {
    public static void main(String[] args){
        int resultado = sumar(3, 6);
        System.out.println("Resultado: "+ resultado);
    }
    
    public static int sumar(int a, int b){
        return a + b;
    }
}
