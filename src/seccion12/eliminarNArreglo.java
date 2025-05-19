package seccion12;

import java.util.Scanner;

public class eliminarNArreglo {
    public static void main(String[] args) {
        //eliminar elemento y desplazar los elementos hacia abajo

        int[]n = new int[10];
        Scanner sc =new Scanner(System.in);

        for (int i=0; i <n.length; i++){
            System.out.print("ingrese un n: ");
            n[i]= sc.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese posicion a eliminar ");
        int posicion = sc.nextInt();

        //desplazamos todos los elementos hacia abajo hasta la posicion a eliminar
        for (int i= posicion;i<n.length-1;i++){
            n[i] = n[i+1];
        }
        //ver datos
//        for (int i=0; i < n.length -1; i++){ //-1 no itere el ultimo elemento
//            System.out.println(i + " " +n[i]);
//        }

        //copiar este arreglo
        int [] b = new int[args.length-1];

        System.arraycopy(n,0,b,0,b.length);//origen/parte de/destino/largode

        for( int i=0; i <b.length; i++){
            System.out.println(i +" "+b[i]);
        }



    }
}
