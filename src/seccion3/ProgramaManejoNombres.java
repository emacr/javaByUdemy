package seccion3;

import javax.swing.*;


public class ProgramaManejoNombres {

    /*
    Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula
 y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe
    * */

    public static void main (String [] args){
        String n1=JOptionPane.showInputDialog("ingrese un nombre: ");
        String n2=JOptionPane.showInputDialog("ingrese otro nombre: ");
        String n3=JOptionPane.showInputDialog("ingrese otro nombre: ");

        String letra = Character.toUpperCase(n1.charAt(1))+"."+n1.substring(n1.length()-2);
        String letra2 = Character.toUpperCase(n2.charAt(1))+"."+n2.substring(n2.length()-2);
        String letra3 = Character.toUpperCase(n3.charAt(1))+"."+n3.substring(n3.length()-2);

        System.out.println(letra+"_"+letra2+"_"+letra3);


    }
}
