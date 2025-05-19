package seccion12;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class OrdenNumeros {
    public static void main(String[] args) {
        //ver si ls numeros esta en orden asc o desc o mezclados (desordenado)

        int [] n = new int[7];

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese 7 numeros");

        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }

        boolean asc = false;
        boolean desc = false;

        for (int i=0; i<n.length-1; i++){ //-1 porq el ultimo no tiene con quien comparar al final, se desborda
            asc = n[i] > n[i+1] ? true:false;
            desc = n[i] < n[i+1] ? true:false;

            if(asc == true && desc == true){
                System.out.println("arreglo desordenado");
            }
            if(asc == false && desc == false){
                System.out.println("arreglo iguales");
            }
            if(asc == false && desc == true){
                System.out.println("arreglo ordenado desc");
            }
            if(asc == true && desc == false){
                System.out.println("arreglo ordenado asc");
            }





        }





    }
}
