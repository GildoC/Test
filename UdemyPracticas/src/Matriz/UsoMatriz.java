package Matriz;

public class UsoMatriz {
    public static void main (String[] args){
        //Matriz tipo String, notacion simplificada
        String nombres [][] = {{"Teresa", "Cesar", "William"},{"Yesenia", "Esteban", "Maria"}};
        //Largo de elementos de la matriz. Primero el no. de renglones
        System.out.println("Largo matriz renglones: " + nombres.length);
        //Seleccionando un renglo valido nos regresa el no. de columnas
        System.out.println("Largo matriz columnas: " + nombres[0].length);
        
        //Imprimo slos valores a la salida estandar
        // iteramos la matriz de String con un for anidado
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.println("Matriz String indice: " + i + "-" + j + " : " + nombres[i][j]);
            }
        }
    }
}
