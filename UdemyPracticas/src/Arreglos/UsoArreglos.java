package Arreglos;

//Maneras posibles de declarar un arreglo

/*
tipo [] nombreArreglo;     o    tipo nombreArreglo[];
*/

public class UsoArreglos {
    //declaracion de arreglos
        int [] enteros;
        int enteros2 [];
        boolean[] banderas;
        boolean banderas2 [];
        PersonaA personas[];
        PersonaA personas2[];
        String[] nombres;
        String nombres2[];
    
    public void inicializacionArreglos(){

        //Inicializar arreglos
        //nombreArreglo = new tipo[largo];
        enteros = new int[10];
        banderas = new boolean[5];
        personas = new PersonaA[13];
        nombres = new String[2];
    }
    
    public void inicializacionElementosArreglos(){
        //nombreArreglo[indice] = valor;
        enteros[0] = 15;
        enteros[1] = 13;
    }
    
    public void inicializarArreglosObject(){
        personas[0] = new PersonaA();
        personas[1] = new PersonaA("Pedro", "Lara");
        nombres[0] = new String("Juan");
        nombres[1] = "Sara";
    }
    
    public void declaracionInstanciacionInicializacionArreglos(){
        //tipo [] nombreArreglo = {lista de valores separados por coma};
        int [] edades = {10,23,41,68,7};
        PersonaA[] personas = {new PersonaA(), new PersonaA("Juan", "Perez")};
        String [] nombres = {"Karla", "Arturo", "Leandro", "Sara"};
    }
}