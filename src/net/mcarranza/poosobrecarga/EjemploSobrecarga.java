package net.mcarranza.poosobrecarga;


public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora cl = new Calculadora();
        System.out.println("sumar: "+cl.sumar(10,5));
        System.out.println("SUmar float: "+cl.sumar(10.0f,5f));
        System.out.println("Integer y float: "+cl.sumar(10.0f,5));

        //suma con varargs(ver metodo)
        System.out.println("suma con varargs: "+cl.sumar(10,5,4,1,8,3));

        /*
        tambien al poner el constructor de clase calculadora privado,
        puedo importar la clase calculadora y sus metodos para optimizar
        import net.mcarranza.poosobrecarga.Calculadora.*;
                System.out.println("sumar: "+sumar(10,5)); lsito
         */


    }
}
