package seccion6;

import java.lang.reflect.Method;

public class GetClassObject {
    public static void main(String[] args) {
        //get class tiene todos los objetos de java
        //refelxion = estrucutra interna
        
        String hola = "hola";
        Class stClass = hola.getClass();

        System.out.println("stClass.getName() = " + stClass.getName()); //incluye name del package
        System.out.println("stClass.getName() = " + stClass.getSimpleName());
        System.out.println("stClass.getName() = " + stClass.getPackageName());

        //metodos campos atributos

        for(Method metodo : stClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName()); //lista todos los metodos de la clase string
        }












    }
}
