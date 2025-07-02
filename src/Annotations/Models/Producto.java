package Annotations.Models;

import Annotations.JsonAtributo;

import java.time.LocalDate;

public class Producto {
    /*
    cada atributo con   @JsonAtributo
    se exportara a json
    se debe crear un procesador con reflexion para q haga efecto,
    ya q por si solo la @ no hace nada
     */
    @JsonAtributo
    private String nombre;
    @JsonAtributo
    private long precio;

    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
