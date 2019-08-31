package Matriz;

public class EjemploMatrices {
    public static void main(String[] args){
        //declaramos una matrix de enteros
        int edades [][];
        //instanciamos la matriz de enteros
        edades = new int [3][2];
        //inicializamos los valores de la matriz de enteros
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;
        
        //imprimimos los valres a la salida estandar
        // leemos los valores de cada elemento de la matriz
        System.out.println("Matriz enteros indice 0-0: " + edades[0][0]);
        System.out.println("Matriz enteros indice 0-1: " + edades[0][1]);
        System.out.println("Matriz enteros indice 1-0: " + edades[1][0]);
        System.out.println("Matriz enteros indice 1-1: " + edades[1][1]);
        System.out.println("Matriz enteros indice 2-0: " + edades[2][0]);
        System.out.println("Matriz enteros indice 2-1: " + edades[2][1]);
        
        //Declaramos e instanciamos una matriz de personas
        PersonaM personas[][] = new PersonaM[3][2];
        //Inicializamos los valores de la matriz de personas
        personas[0][0] = new PersonaM("Juan");
        personas[0][1] = new PersonaM("Armando");
        personas[1][0] = new PersonaM("Karla");
        personas[1][1] = new PersonaM("Laura");
        personas[2][0] = new PersonaM("Pedro");
        personas[2][1] = new PersonaM("Javier");
        
        //leemos los valores de cada elemeno de la matriz con un ciclo for anidado
        System.out.println("");
        for (int i = 0; i < personas.length; i++){
            for (int j = 0; j < personas[i].length; j++){
                System.out.println("Matriz personas indice: " + i + "-" + j + ": " + personas[i][j]);
            }
        }
        
        // Matriz de tipo String, notacion simplificada
        String nombres[][] = {{"Teresa", "Cesar", "William"}, {"Yesenia", "Esteban", "Maria"}};
        System.out.println("");
        System.out.println("Largo matriz renglones: " + nombres.length);
        System.out.println("Largo matriz columnas: " + nombres[0].length);
        
        //Imprimimos los valores a la salida estandar
        //Iteramos la matriz de String con un for anidado
        System.out.println("");
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.println("Matriz String indice: " + i + "-" + j + ": " + nombres[i][j]);
            }
        }
    }
}
