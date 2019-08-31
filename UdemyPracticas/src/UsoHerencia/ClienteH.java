/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsoHerencia;

/**
 *
 * @author Gildo
 */

import java.util.Date;

public class ClienteH extends PersonaH{
    private int idCliente;
    private java.util.Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public ClienteH(Date fechaRegistro, boolean vip){
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public Date getFechaRegistro(){
        return fechaRegistro;
    }
    
    public boolean isVip(){
        return vip;
    }
    
    public void setVip(boolean vip){
        this.vip = vip;
    }
    
    @Override
    public String toString(){
        //primero mandamos llamar el metodo toString de la clase padre(PersonaH)  para poder observar los valores de la clase Padre
        //luego imprimimos los valores de la clase Hija concatenado al String retornado de la clase Padre
        return super.toString() + " Cliente { " + " idCliente = " + idCliente + ", fechaRegistro = " + fechaRegistro + ", vip = " + vip + " }";
    }
}