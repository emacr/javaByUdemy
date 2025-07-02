package ProgramacionFuncional.ExpresionesLambda;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionLambda {
    //function: recibe argumentos, devuelve un valor

    public static void main(String[] args) {
        Function<String, String> f1= param -> "Holaa "+param;
        String res = f1.apply("andres");
        System.out.print(res); //hola andres


        //referencia de metodos ::
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("\nlola"));


        //bfunciton = recibe 2 arguemntos y devuelve 2

        BiFunction<String,String,String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("andres, ","carlos");
        System.out.println(r2);

        BiFunction<String,String,Integer> f4 = (a,b) -> a.compareTo(b); //devuelve un entero (0 es igual, -1 es diferente)
        System.out.println (f4.apply("carlos, ","carlos"));




    }



}
