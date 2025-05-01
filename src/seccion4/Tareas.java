package seccion4;

import javax.smartcardio.CommandAPDU;
import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Tareas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
        //programa q pida 2 numeros y los muestre ordenados de mayor a menor

        int n1 = 0;
        int n2 = 0;
        int mayor=0;

        System.out.print("Ingrese un numero: ");
       n1= sc.nextInt();
        System.out.print("Ingrese un numero: ");
       n2= sc.nextInt();

        mayor = (n1>n2) ? n1:n2;
        mayor = (n2>n1) ? n2:n1;

        //otra forma
      //  String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println(mayor);


*/
        //imprimir cantidad de medida gas

//        String capacidad="";
//        int medida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida actual del gas: "));
//
//        capacidad = medida == 70 ? "Estanque lleno" : "";
//
//        capacidad = (medida == 60) && (medida <=70) ? "Estanque casi lleno":"";
//
//        System.out.println(capacidad);



                // Solicitar medida al usuario
//                double medida = Double.parseDouble(
//                        JOptionPane.showInputDialog("Ingrese la medida actual del gas (en litros):")
//                );
//
//                // Evaluar condición según rangos
//                String resultado;
//
//                if (medida == 70) {
//                    resultado = "Estanque lleno";
//                } else if (medida >= 60 && medida < 70) {
//                    resultado = "Estanque casi lleno";
//                } else if (medida >= 40 && medida < 60) {
//                    resultado = "Estanque 3/4";
//                } else if (medida >= 35 && medida < 40) {
//                    resultado = "Medio Estanque";
//                } else if (medida >= 20 && medida < 35) {
//                    resultado = "Suficiente";
//                } else if (medida >= 1 && medida < 20) {
//                    resultado = "Insuficiente";
//                } else if (medida < 1) {
//                    resultado = "Estanque vacío o valor inválido";
//                } else {
//                    resultado = "Valor fuera del rango (más de 70 litros)";
//                }
//
//                // Mostrar resultado
//                JOptionPane.showMessageDialog(null, resultado);

        //solicitar nombre e imprimir el mas largo
        String nombre1 = JOptionPane.showInputDialog(null,"Ingrese el nombre: ");
        String nombre2 = JOptionPane.showInputDialog(null,"Ingrese el nombre: ");
        String nombre3 = JOptionPane.showInputDialog(null,"Ingrese el nombre: ");

        /*
        *El método .split() en Java se utiliza para dividir,
        *       una cadena (String) en partes usando un delimitador
        *  (como espacios, comas, guiones, etc.) y devuelve un arreglo de String.
        * */

        String dn1 = nombre1.split(" ")[0]; //acedemos al nombre con 0 y no al apellido o lo venga despues de la separacion " "
        String dn2 = nombre2.split(" ")[0];
        String dn3 = nombre3.split(" ")[0];
        String  resultado ="";

        if (dn1.length() > dn2.length() && dn1.length() > dn3.length()){
            resultado = dn1;
        }else if(dn2.length() > dn1.length() && dn2.length() > dn3.length()) {
            resultado = dn2;
        }else{
            resultado = dn3;
        }

        /*
        tambien:
         String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;
        
        * */


        JOptionPane.showMessageDialog(null,resultado + " tiene el nombre mas largo.");
/*
* otra forma de hacerlo con un loop
*
*  String nombreCompletoMasLargo = "";
        int longitudMayor = 0;

        // Repetimos el proceso 3 veces
        for (int i = 1; i <= 3; i++) {
            String persona = JOptionPane.showInputDialog("Ingrese el nombre completo de la persona #" + i);
            String nombre = persona.split(" ")[0]; // obtenemos solo el nombre (antes del espacio)

            if (nombre.length() > longitudMayor) {
                longitudMayor = nombre.length();
                nombreCompletoMasLargo = persona;
            }
        }

        JOptionPane.showMessageDialog(null, nombreCompletoMasLargo + " tiene el nombre más largo.");
* */




    }
}
