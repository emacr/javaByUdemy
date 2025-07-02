package PooExcepciones;

import javax.swing.*;

public class ejemploExepcionPersonalizada {
    public static void main(String[] args) {
        Calculadora cl = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un numero: ");

        int divisor;
        double division;

        try{
            divisor = Integer.parseInt(valor);
            division = cl.dividir(10,divisor);
            System.out.println(division);

            double divicion2 = cl.dividir("","");
            System.out.println(divicion2);

        } catch (DivicionPorZeroException dz) {
            System.out.println("mensaje personalizado: "+dz.getMessage());
        } catch (formatoNException fe) {
            System.out.println("mensaje personalizado: "+fe.getMessage());
            fe.printStackTrace(); //salida mas informativa
        }finally {
            System.out.println("en fin ...");
        }


    }
}
