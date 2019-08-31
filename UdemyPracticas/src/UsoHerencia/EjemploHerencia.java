package UsoHerencia;

public class EjemploHerencia {
    public static void main(String[] args){
        EmpleadoH e1 = new EmpleadoH("Juan", 25000);
        System.out.println("Imprimimos el objeto Empleado1");
        System.out.println(e1);
        
        EmpleadoH e2 = new EmpleadoH("Pedro", 15000);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDireccion("Bogota, Colombia");
        System.out.println("\nImprimimos el objeto Empleado2");
        System.out.println(e2);
        
        //Al crear un nuevo objeto de java.util.Date nos regresa la fecha actual
        ClienteH c1 = new ClienteH(new java.util.Date(), false);
        System.out.println("\nImprimir el objeto Cliente1");
        System.out.println(c1);
        //Completamos el objeto persona asociado a este objeto cliente
        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDireccion("Mexico, DF");
        System.out.println("\nVolvemos a imprimir el objeto cliente 1");
        System.out.println(c1);
    }
}