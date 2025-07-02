package ProgramacionFuncional.ExpresionesLambda;

import ProgramacionFuncional.ExpresionesLambda.Models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {

        //lambda (funcion o metood de flecha) = implementar um metodo sin necesidad de implemetar una clase
        //clase anonima

        //consumer =  expresion lamda q permite pasar x argumento 1 parametro de tipo generico, es void

         //las siguientes son expresiones lambda predefinidas

        Consumer<String> consumidor = saludo -> {
            System.out.println(saludo);
        };

        Consumer<Date> consumidor2 = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept("Hola mundo");
        consumidor2.accept(new Date());

        //2 parametros
        BiConsumer <String, Integer> consumidor3 = (nombre,edad) -> {
            System.out.println(nombre+" tiene "+edad+" anios");
        };

        consumidor3.accept("ana",12);

        //otra forma mas facil
        Consumer<String> cosumidor4 = System.out::println;
        cosumidor4.accept("Hola mundo desde lambda");

        //referencia de metodo
        List<String> nombres = Arrays.asList("ana","juan","pedro");
        nombres.forEach(cosumidor4); //paso el consumidor q imprime


        Usuario u = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = (persona,nombre) -> {
            persona.setNombre(nombre);
        };
        asignarNombre.accept(u,"Andres");
        System.out.println("Nombre usuario: "+u.getNombre());

        //supplier solo devuelve un valor, no acepta argumentos
        Supplier<String> proveedor = () -> {
            return "Hola mundo desde supplier";
        };
        System.out.println(proveedor.get());




    }
}
