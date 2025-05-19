package seccion12;

import java.util.Scanner;

public class DesplazarPosicion {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);

        //llenar arreglo
        for (int i=0; i < a.length; i++){
            System.out.print("ingrese 10 numeros: ");
           a[i] = sc.nextInt();
        }
        System.out.println();
        //pasar el ultimo elemento al primero: 10 poscion o 1 posicion 1 .....

        int ultimo = a[a.length-1]; //ultimo elelmento

        for(int i= a.length -2; i>=0;i--){ //lenght -2(parte del antepenultimo, el ultimo ya esta en variable) i-- porq decrementa
            a[i+1] = a[i]; //asigno posicion actula del i+1
        }
        a[0] = ultimo;
        System.out.println("arreglo final");
        for (int i=0; i < a.length; i++){
            System.out.println("indice " +i + ": " +a[i]);
        }
    }
}
