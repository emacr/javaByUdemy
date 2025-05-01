package seccion4;

import java.util.Scanner;

public class LoginOperadorTernario{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] apellidos = {"perez","castro","salas"};
        String [] passwords = {"123","456","789"};
        boolean autenticado = false;

        System.out.println("Nombre: ");
        String a =sc.next();
        System.out.println("clave: ");
        String p = sc.next();

        for (int i=-0; i<apellidos.length;i++){
            //uso operador ternario
            //nota = si sonmuchos valores uso un if normal para poner el break
            autenticado = (apellidos[i].equals(a) && passwords[i].equals(p))? true: autenticado; //autenticado es false por asignacion
        };

        String mensaje = autenticado ? "Bienvenido".concat(a):"User o pass incorrectos";
        System.out.println(mensaje);

    }
}
