package seccion5;

import javax.swing.*;

public class FlujoFor {
    public static void main(String[] args) {
        //arreglos y for
        String [] nombres = {"ana","pedro","marta"};
        for (int i=0; i<nombres.length; i++){ //una buena practica es deifinir el .lenght afuera en una variable y ponerla adentro
            System.out.println(nombres[i]); //imprimo el contenido
        }

        System.out.println("\nnombres con for each:");
        for( String name: nombres){ //for each
            System.out.println(name);
        }

        /*
        for int i =0; inicio
        i <= 5; se evalua la expresion true or false, itera de 0 a 4 xq el 5 no se incluye
        i++; incremento a i
        * */

        for (int i=0; i<=5; i++){
            System.out.println(i); //imprime de o a 5
        }
        //cuando llega a i=6 pregunta i<5 ? no entonces termina

        //decrementar
        System.out.println("\n decrementos");
        for(int i =10; i>=0; i--){
            System.out.println("i = " + i);
        }

        //mostrar solo numeros impares
        System.out.println("numeros impares");
        for(int i=0; i<=10; i++){
            if(i%2==0){   //es par , puedo negarlo asi if(!(i%2==0)){}
                continue;

                //coloco continue para q no evalue el if pero siga con el for
                //si pongo break se me sale de todo
            }
            System.out.println(i);

        }

        //arreglos y for
        String [] paises = {"usa","panama","cr","alemania","rusia","japon"};
        int count = paises.length;

        System.out.println("nombres de paises");

        for (int i =0; i < count; i++){ //en i<count no colocar el = xq al final intentara acceder al 6 elemento del array pero no existe ya q llega hasta 5 y dara un error xq parte en 0
            //imprimir desde el 2 elemento
            if(paises[i].equalsIgnoreCase("usa")){
                continue;
            }
            System.out.println(paises[i]);
        }

        //buscar un nombre
        String [] nombre = {"maria","ana","pedro","juan"};
        String buscar = JOptionPane.showInputDialog("ingrese un nombre: ");
        int largo = nombre.length;
        boolean encontrado = false;
        for (int i = 0; i < largo; i++){
            if (nombre[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,"fue encontrado = "+buscar);
        }else{
            JOptionPane.showMessageDialog(null,"nombre no existe");
        }












    }
}
