package Annotations;

import Annotations.Models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class Ejemplo {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("Mesa de centro roble");
        p.setPrecio(5000L);

        //procesar las anotaciones de Producto
        Field[] campos =p.getClass().getDeclaredFields();
        //utilizar apistream
        Arrays.stream(campos).filter(f -> f.isAnnotationPresent(JsonAtributo.class)) //filtra los campos con @ de producto
                .map(f-> {
                    String nombre= f.getAnnotation(JsonAtributo.class).nombre().equals("") ? f.getName() : f.getAnnotation(JsonAtributo.class).nombre(); //operador ternario para validar

                return "\""

                });





    }
}
