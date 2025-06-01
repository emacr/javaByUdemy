package org.mcarranza.appfacturas.modelo;

public class Producto {
    private int codigo; //lo autogenero
    private String nombre;
    private float precio;

    //autogenerar codigo
    private static int ultimoCodigo;

    //constructor
    public int getCodigo() {
        return codigo;
    }

//constructor vacio
    public Producto() {
        this.codigo = ++ultimoCodigo;

    }

    //el set codigo lo hago incremental, quito el set
//    public void setCodigo(int codigo) {
//        this.codigo = codigo;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

//to string
    @Override
    public String toString() {
        return codigo+
                "\t"+nombre+
                "\t"+precio;
    }
}
