package Modelo;

public class Articulo {
    int id;
    int pos;
    String traer;
    String llevar;
    String estado;
    String nombre;
    String descripcion;
    int cantidad;
    String foto;

    public Articulo() {
    }

    public Articulo(int pos, String traer, String llevar, String estado, String nombre, String descripcion, int cantidad, String foto) {
        this.pos = pos;
        this.traer = traer;
        this.llevar = llevar;
        this.estado = estado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public int getPos() {
        return pos;
    }

    public String getTraer() {
        return traer;
    }

    public String getLlevar() {
        return llevar;
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setTraer(String traer) {
        this.traer = traer;
    }

    public void setLlevar(String llevar) {
        this.llevar = llevar;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    
}
