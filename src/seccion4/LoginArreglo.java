package seccion4;

import java.util.Scanner;

public class LoginArreglo {
    public static void main(String[] args) {
        /*
        Un arreglo puede almacenar objetos, variables, datos
        deben ser del mismo tipo de dato por ej String

        vamos a optimizar el cod de LoginOperadores usando arreglos

        * */

        //arreglo de String
        //creo instancia del arreglo y cantidad elementos dentro de []
        String[] users = new String[3];
        String[] pass = new String[3];

        //definir arreglo de forma mas sencilla
        String [] apellidos = {"perez","castro","salas"};


        //guardar datos en arreglos
        users[0] = "andres";
        users[1] = "emma";
        users[2] = "ana";

        pass[0]="12345";
        pass[1]="54321";
        pass[2]="4444";

        for (String n : users){
            System.out.println(n);
        };
        boolean esAtutenticado =false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su usuario");
        String user = sc.next();
        System.out.println("Ingrese su clave");
        String clave = sc.next();


        //iterar con for para hacerlo de forma dinamica
        /*
        el for esta formado por 3 partes, la 1 cuando se inicializa i=0,
        la segunda parte hasta donde debe llevar i>4
        y la 3 parte es para incrementar
        * */
        for (int i =0; i<users.length;i++ ){
            if ((users[i].equals(user) && pass[i].equals(clave))){
                esAtutenticado = true;
                System.out.println("correcto");
                break; //sale del for cuando encuentra el user
            }
        }
        if(!esAtutenticado){
            System.out.println("User o clave incorrecta");
        }







    }
}

