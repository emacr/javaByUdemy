package seccion5;

import javax.swing.*;

public class SwitchCases {
    public static void main(String[] args) {

        //compara el valor de una variable y ejecuta casos

        int n =2;
        switch (n){
            case 0:
                System.out.println("el n es 0");
                break;
            case 1:
                System.out.println("el n es 3");
                break;
            case 2:
                System.out.println("el n es 2");
                break;
            default:
                System.out.println("esta mal");
                break;
        }
        String name = "andres";
        switch (name){
            case "admin":
                System.out.println("Hola admin");
            case "juan":
                System.out.println("hola andres");
        }

        //obtener el nombre del mes
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del anio: "));
        int nDias = 0;

        switch (mes){
            case 1: // esto se asimiliaria como el or, ya q sin break va evaluando condicones enc cascada
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nDias = 31;
                break; // desde el 1 hasta el 12 se ejecutara en cascada ya q esos tienen 31 dias
            case 4:
            case 6:
            case 9:
            case 11:
                nDias = 30;
                break;
            case 2:
                if(anio % 400 ==0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
                    nDias = 29;
                }
                break;
            default:
                System.out.println("el mes no coincide");
                break;
        }
        System.out.println(nDias );





    }
}
