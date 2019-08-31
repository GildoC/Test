package SobrecargaMetodos;

public class PruebaOperaciones {

    public static void main(String[] args){
        System.out.println("Resultado 1: " + Operaciones.sumar(3, 4));
        System.out.println("Resultado 2: " + Operaciones.sumar(5, 4.1));
        System.out.println("Resutlado 3: " + Operaciones.sumar(7.1, 3));
        System.out.println("Resultado 4: " + Operaciones.sumar(2.2, 2.8));
        System.out.println("Resultado 5: " + Operaciones.sumar(3, 1L));
        System.out.println("Resultado 6: " + Operaciones.sumar(3F, 'A'));        
    }
}
