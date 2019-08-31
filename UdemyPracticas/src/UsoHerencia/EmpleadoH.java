/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsoHerencia;

/**
 * en las herencias solo se heredan los metodos y atributos que son del tipo public
 * los que son private no se heredan
 *
 * @author Gildo
 */
public class EmpleadoH extends PersonaH{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
    public EmpleadoH (){}
    
    public EmpleadoH(String nombre, int sueldo){
        super(nombre);      //Super debe ser la primera linea
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }
    
    public int getIdEmpleadoH(){
        return idEmpleado;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Empleado{ " + "idEmpleado = " + idEmpleado + ", Sueldo = " + sueldo + "}";
    }
    
}
