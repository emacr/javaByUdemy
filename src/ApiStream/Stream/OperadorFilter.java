package ApiStream.Stream;

import ApiStream.Models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OperadorFilter {
    public static void main(String[] args) {

       //INstanciar de la clase usuario
        //transformar un tipo string  a objeto(ususario)
        Stream<Usuario> names = Stream.of("Valeria Salas","Jovenal Guzman","Pedro Pascal") //nombres
                .map(n -> new Usuario(n.split(" ")[0], n.split(" ")[1])) //mostrar nombre y apellido
                .filter(u-> u.getNombre().startsWith("P"));

        Optional<Usuario> user = names.findFirst();
        System.out.println(user.get());






    }
}
