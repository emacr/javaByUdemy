package seccion12;

import java.util.Scanner;

public class NumMayorFor {
    public static void main(String[] args) {
        int [] a = new int [5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrse 5 numeros");
        for(int i=0; i<a.length;i++){
            a[i] =sc.nextInt(); //recibo el valor digitado
        }

        int aux = 0; //guarda el indice del n mayor
        for(int i=0; i<a.length;i++){ //para preguntar y calcular n mayor
            aux = (a[aux] > a[i]) ? aux : i;
        }
        System.out.println("a = " + a[aux]);
        System.out.println("\n");


        //ver n mas grande de lista
        int [] n = {23,44,11,55,33};
        int max=0;
        for(int i=0;i<n.length;i++){
            max = n[max] > n[i] ? max : i;
        }
        System.out.println("n = " + n[max]);


    }
}
