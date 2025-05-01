package seccion4;

import javax.swing.*;

public class operadoresAritmeticos {
    public static void main(String[] args) {
        int i =5, j=4; //definir 2 variables cuando son del mismo tipo

        int suma = i+j, resta =i-j;

        System.out.println("resta es: "+ (i-j));

        //casteo
        float div = (float) i/j;

        //resto
        int resto = i%j;

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        if (n %2 ==0){
            System.out.println("numero par");
        }else{
            System.out.println("numero impar");
        }






    }
}
