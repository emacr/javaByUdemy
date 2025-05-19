package seccion12;

import java.util.Scanner;

public class AgregarElemento {
    public static void main(String[] args) {
         //arreglo de n

        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int elemento,posicion;

        for (int i=0; i<n.length-1;i++){ //-1 para q llegue a posicion 8 y deje la 9 vacia
            System.out.print("Ingrese un numero: ");
            n[i] = sc.nextInt();
        }

        //ingresar un nuevo numeros
        System.out.println("Ingrese nuevo n");
        elemento =sc.nextInt();

        //posicion donde ira el elemento
        System.out.println("Ingrese la posicion: ");
        posicion = sc.nextInt();

        //insertar nuevo n en posicion ingreasada
        for(int i= n.length -2; i>= posicion; i--){ //-2 posicion 8 xq la nueve daria error
            n[i+1] = n[i]; //muevo todas las posiciones hacia adelante de la psocion ingresada
        }
        n[posicion] = elemento;

        System.out.println();
        for (int i=0; i <n.length; i++){
            System.out.println(n[i]);
        }




    }
}
