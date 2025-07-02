package PooExcepciones;

import javax.swing.*;

public class ejemploExepciones {
    public static void main(String[] args) {

        /*hay 2 tipos de excepciones
        checked and unchecked
        las unchecked no nos obliga a manjear el error
puedo manejar los errores, ya se continuando con otras tareas,
informando al usuario ...

         */



        try{
            int divisor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: "));
            int i = 10/divisor;
            System.out.println(i);

            String valor = JOptionPane.showInputDialog("Ingrese un numero: ");
            int n = Integer.parseInt(valor);
            System.out.println("\nValor ingresado por usuario: "+n);

            // } catch (Exception e) { //exception es el mas generico, pero puedo ser mas especifico llamando otroos metodos
        } catch (ArithmeticException e) {
            System.err.print("capturando excepcion: "+e.getMessage());
            main(args); //vuelve a ejecutar el try
        } catch (NumberFormatException e) {
            System.err.print("capturando, error de capa 8: "+e.getMessage());
            main(args);

        }
        finally {//cerrar recursos. siempre se ejecuta
            System.out.println("\ncontinuamos");
        }


    }

}
