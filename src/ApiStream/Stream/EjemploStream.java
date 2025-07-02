package ApiStream.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {


    public static void main(String[] args) {

        //varias formas de crear un stream

        //1 crear con metood of
        Stream<String> nombres = Stream.of("pato","pepe","carlos");

        //invocar a lo operadores (intermdeios,finales)

        //nombres.forEach(e -> System.out.println(e));
        //por referencia
        nombres.forEach(System.out::println);


        //2 crear a partir de un arreglo
        String[] arreglo = {"panama","usa","canda"};
        Stream<String> paises = Arrays.stream(arreglo);
        paises.forEach(System.out::println);


        //3 crear usado streambuilder
        Stream<String> animales = Stream.<String>builder().add("pato").add("cabra").add("caballo").build();
        animales.forEach(System.out::println);


        //4 crear a partir de un tipo collection
        List<String> lista = new ArrayList<>();
        lista.add("zanahoria");
        lista.add("manzana");
        lista.add("mango");

        Stream<String> frutas = lista.stream();
        frutas.forEach(System.out::println);

        //otra manera de imprimir quitando lineas 40 41
        //lista.stream().forEach(System.out::println);


        var nam = new ArrayList<Person>();
        nam.add(new Person("Ana",21));
        nam.add(new Person("Carlos",33));
        nam.add(new Person("Rebeca",13));
        nam.add(new Person("Gracia",55));

        //add the minors to a list
        //first without streams
        List<Person> minors = new ArrayList<>();
        for(Person p : nam){
            if(p.getAge() <18){
                minors.add(p);
            }
        }

        //now adding the minors to a list using streams
        List<Person> minorsStream = nam
                .stream() //original list
                .filter(p -> p.getAge() <18) //filter people younger than 18
                .toList();

        //compare both results
        System.out.println(minors.equals(minorsStream)); //true



        }


}

//create class Person

class Person{
    String name;
    int age;

    public Person(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

