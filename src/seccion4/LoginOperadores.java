package seccion4;

import java.util.Scanner;

public class LoginOperadores {
    public static void main(String[] args) {
        String name = "emma";
        String pass = "12345";

        String name2 = "ana";
        String pass2 = "54321";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su usuario");
        String user = sc.next();
        System.out.println("Ingrese su clave");
        String clave = sc.next();

        //comparar con operadores
        boolean esAtutenticado =false;

        if ((name.equals(user) && pass.equals(clave)) || (name2.equals(user) && pass2.equals(clave))){
            esAtutenticado = true;
        }else{
            System.out.println("User o clave incorrecta");
        }
        if(esAtutenticado){ //es true?
            System.out.println("Bienvenido "+user);
        }else{
            //necesita autenticacion
            System.out.println("Usuario no existe");
        }

    }
}
