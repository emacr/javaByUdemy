package seccion12;

import java.util.Scanner;

public class ImparesPares {
    public static void main(String[] args) {
        //ver de una lista ingresada cuales son par/impar
        //ingresar los pares en arreglo par
        //ingresar los impares en arreglo impar

        int [] n = {83,11,2,5,4,6,7,90,92,11,8}, pares, impares; //pares impares estan vacios
        int totalPares = 0, totalImpares = 0;
        boolean par = false;

        for(int i=0; i<n.length;i++){
           par = n[i] % 2 == 0 ? true:false;
           if (par){
               totalPares++;
           }else{
               totalImpares++;
           }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0; //pares
        int k = 0; //impares

        for (int i=0; i< n.length; i++){
            par = n[i] % 2 == 0 ? true:false;
            if (par){
                pares[j++] = n[i];
            }else{
                impares[k++] = n[i];
            }
        }
        System.out.println("pares");
        for(int i=0; i<pares.length;i++){
            System.out.println(pares[i]+ " ");
        }
        System.out.println("\n\nimpares");
        for(int i=0; i<impares.length;i++){
            System.out.println(impares[i]+ " ");
        }




    }




}
