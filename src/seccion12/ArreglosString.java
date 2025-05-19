package seccion12;

import java.util.Arrays;

public class ArreglosString {
    public static void main(String[] args) {
        String[] productos = new String[5];
        productos[0]="avena";
        productos[1]="ajos";
        productos[2]="manteca";
        productos[3]="sal";
        productos[4]="azucar";

        System.out.println(productos[0]); //avena

        //ordenar de la a a la z
        Arrays.sort(productos); //arrays clase de ayuda para usar sus metodos

        //for each
        for(String p : productos){
            System.out.println("p = " + p); //ordenado con sort
        }

        //for normal
        int cantidad = productos.length;
        for(int i=0; i<cantidad; i++){
            System.out.println("valor de = " + i +" : "+productos[i]);
        }
        System.out.println("while\n");
        //while
        int i = 0;
        while(i<cantidad){
            System.out.println(productos[i]);
            i++;
        }

        //para este ejemplo q se conoce el length es mejor usar for

        //llenar un arreglo de numeros con un for
        int [] numeros = new int[10];
        int totalN = numeros.length;

        //for para llenar datos
        for (int j = 0; j < totalN; j++){
            numeros[j]=j*3; //3.0=0, 3.1=3, 3.2=6 ...
        }
        //for para recorrer arreglo
        for (int j = 0; j < totalN; j++){
            System.out.println("numeros[j] = " + numeros[j]);
        }

        //reccorrer areglo de forma inversa
        System.out.println("\t\t\trecorrer a la inversa");
        for(int j =0; j< cantidad;j++){
            System.out.println("valor: "+productos[cantidad-1-j]); //total - 1 - j(indice) q se va incrementando
        }

        //reccorrer areglo de forma inversa 2

        System.out.println("\t\t\trecorrer a la inversa forma2");

        for(int j= cantidad-1; j>=0; j--){ //parto del ultimo elemento, cambio condicion y decremento
            System.out.println("productos: " +productos[j]);
        }

        //otra forma de declarar elementos
        //esta forma es para cuando tengo definido la cantidad de elementos
        String[] productos2 = {"malanga","naranja","limon"};


        //recorrer a la inversa
        System.out.println("\t\t\t inversa");
        int n = productos2.length;
        for (int j = 0; j < n/2; j++) { //el punto de inflexion es la mitad q ordene hasta la mitad n/2
            String actual = productos2[j];
            String inverso  = productos2[n-1-j];
            productos2[j] = inverso;
            productos2[n-1-j] = actual;
        }
        for(int j =0; j<n; j++){
            System.out.println(productos2[j]);
        }



    }
}
