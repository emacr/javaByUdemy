package seccion12;

import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Scanner;

public class BuscarElementos {
    public static void main(String[] args) {
        Integer [] a= {10,4,11,55,1,6,3,8,7,22,56,9};
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean encontrado = false;
        System.out.println("Ingrese un n a buscar");
        n = sc.nextInt();
        for(int i=0; i<a.length-1; i++){
            encontrado = a[i] == n ? true:false;
            if(encontrado){
                System.out.println("numero encontrado: "+ a[i] +" que esta en la posicion: "+i);
            }
        }
    }
}
