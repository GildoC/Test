package SobreCargaConstructores;

public class SobrecargaConstructores {
    public static void main(String[] args){
        //El contructor vacio es rpivado, por lo que nos obliga a utilizar el unico constructor
        //publico y por lo tanto proporcionar valores en los campos de nombre y edad
        
        PersonaC p1 = new PersonaC("Lilia", 22);
        System.out.println("Imprimmimos el objeto p1");
        System.out.println(p1);
        
        //Creamos un nuevo objeto de tipo persona
        PersonaC p2 = new PersonaC("Juan", 33);
        System.out.println("/n Imprimimos el objeto p2");
        System.out.println(p2);
        
        //creamos un bjeto empleado
        EmpleadoC e1 = new EmpleadoC("Pedro", 29, 18000);
        System.out.println("/nImprmimos el objeto e1");
        System.out.println(e1);
    }
}
