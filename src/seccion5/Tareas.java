package seccion5;

import javax.swing.*;

public class Tareas {
    public static void main(String[] args) {
        //encontrar el n mayor e imprimirlo

        int [] n = {30,29,9,1,33,44,2,41,42,99};

        int nLen = n.length;

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a comparar (max 10): "));

        try {
        if(cantidad <= 10){
            for (int i =0; i<nLen; i++){
              //  System.out.println(n[i]);
            }
        }
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("numeros a comparar mayor a 10");
        }






    }
}
