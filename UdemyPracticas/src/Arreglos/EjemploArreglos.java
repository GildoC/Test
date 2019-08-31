package Arreglos;

public class EjemploArreglos {
    public static void main(String[] args){
    //declaramos un arreglo de enteros
    int edades[];
    //instanciamos el arreglo de enteros
    edades = new int[3];
    //inicializamos los valores del arreglo de enteros
    edades[0] = 30;
    edades[1] = 15;
    edades[2] = 20;
    //leemos los valores de cada elemento del arreglo
    System.out.println("Arreglo enteros indice 0: " + edades[0]);
    System.out.println("Arreglo enteros indice 1: " + edades[1]);
    System.out.println("Arreglo enteros indice 2: " + edades[2]);
    
    Persona personas[];
    personas = new Persona[4];
    personas[0] = new Persona("Juan");
    personas[1] = new Persona("Karla");
    personas[2] = new Persona("Pedro");
    
    System.out.println("Arreglo personas indice 0: " + personas[0]);
    System.out.println("Arreglo personas indice 1: " + personas[1]); 
    System.out.println("Arreglo personas indice 0: " + personas[2]);
    //Arreglo String con notacion simplificada
    String nombres [] = {"Sara", "Laura", "Carlos", "Carmen"};
    //imprimimos los valores de salida standar con un iterador
    
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Arreglo nombres indice " + i + ": " + nombres[i]);
        }
    }
}