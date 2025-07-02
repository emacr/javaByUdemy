package ProgramacionFuncional.ExpresionesLambda.Models;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        //evaluar una expresion bool
//devulve un bool

        Predicate<Integer> test1 = num -> num > 10;
        boolean res = test1.test(11);
        System.out.println(res);

        Predicate<String> t2 = rol -> rol.equals("admi");
        System.out.println(t2.test("secre"));

        //recibe 2 args y devuelve bool
        BiPredicate<String,String> t3 = (a,b) -> a.equals(b);
        System.out.println(t3.test("pepe","ana"));


    }
}
