package ApiStream.Stream;

import ApiStream.Models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperadorMap {
    public static void main(String[] args) {


        //map retorna los elementos modificados
        //simpre retorna
        Stream<String> nombres = Stream.of("pato","pepe","carlos")
                .map(nombre -> {

            String mayuscula ="";
            if(nombre.startsWith("p")){
                mayuscula = nombre.toUpperCase();//transformacion
            }
            return mayuscula; //retorno
        });

       nombres.forEach(System.out::println); //invoco metodo para llamar al flujo

        //O TAN BIEN DE ESTA FORMA
        Stream<String> nombres2 = Stream.of("sandra","ana","beto")
                .map(String::toUpperCase);
        nombres2.forEach(System.out::println);

        //convertir a una lista con cambios
        Stream<String> nombres3 = Stream.of("sandra","ana","beto")
                .map(String::toUpperCase);
        List<String> lista = nombres3.toList(); //lista
        lista.forEach(System.out::println);


        Stream<Usuario> datos = Stream.of("carlos","ana\n").map(nombre -> new Usuario(nombre,null));
       datos.forEach(u -> System.out.println(u.getNombre()));


       //INstanciar de la clase usuario
        //transformar un tipo string  a objeto(ususario)
        Stream<Usuario> names = Stream.of("Valeria Salas","Jovenal Guzman","Pedro Pascal") //nombres
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1])) //mostrar nombre y apellido
                .map(usuario -> {
                   String nombre = usuario.getNombre().toUpperCase();
                   return usuario; //return usuario modificado
                });
        List<Usuario> lista2 = names.toList();
        lista2.forEach(System.out::println);






    }
}
