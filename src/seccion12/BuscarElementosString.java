package seccion12;

import java.util.Scanner;

public class BuscarElementosString {
    public static void main(String[] args) {
        String [] texto= {"andres","ana","fabiola"};
        Scanner sc = new Scanner(System.in);
        String n = "";
        boolean encontrado = false;
        System.out.println("Ingrese un n a buscar");
        n = sc.next();
        for(int i=0; i<texto.length; i++){
            encontrado = texto[i].equalsIgnoreCase(n) ? true:false;
            if(encontrado){
                System.out.println("numero encontrado: "+ texto[i] +" que esta en la posicion: "+i);
            }
        }
    }
}
