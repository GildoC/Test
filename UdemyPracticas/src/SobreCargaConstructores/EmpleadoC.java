package SobreCargaConstructores;

public class EmpleadoC extends PersonaC{
    private double sueldo;
    
    public EmpleadoC(String nombre, int edad, double sueldo){
        super(nombre, edad);    //super debe ser la primera linea
        this.sueldo = sueldo;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        //primero mandamos a llamar el metodo toSting de la clase Persona
        //para que podamos observar los valores de la clase adre;
        // y despues imprimimos los valores de la clase hija
        return super.toString() + "Empleado { sueldo = " + sueldo + " } ";
    }
    
}
