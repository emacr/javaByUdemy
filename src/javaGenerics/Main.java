package javaGenerics;

public class Main {
    public static void main(String[] args) {

        //guardar cosas en la clase generica

        //guardar strings
        Genericos<String> cajaString = new Genericos<>();
        cajaString.ponerAlgo("hola");

        //obtener el valor
        String contendoS = cajaString.obtenerValor();
        System.out.println(contendoS);


        //guardar enteros
        Genericos<Integer> cajaEnteros = new Genericos<>();
        cajaEnteros.ponerAlgo(123);

        int contendoI =cajaEnteros.obtenerValor();
        System.out.println(contendoI);


    }


}
