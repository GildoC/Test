package UsoStatic;

public class EjemploStatic {
    public static void main(String[] args){
        PersonaS p1 = new PersonaS("Juan");
        System.out.println("Persona1: " + p1);

        PersonaS p2 = new PersonaS("Karla");
        System.out.println("Persona2: " + p2);
        
        //Imprimimos el contador de personas
        System.out.println("No. Personas: " + PersonaS.getContadorPersonas());
        
        PersonaS p3 = new PersonaS("Rodrigo");
        System.out.println("Contador personas modificado"+ p1);
        System.out.println("Contador personas modificado"+ p3);
    }
}
