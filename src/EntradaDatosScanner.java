import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatosScanner {
    public static void main(String[] args) {
        //entrada de datos desde consola
        Scanner sc = new Scanner(System.in); //instancia de scanner, se debe importar
        System.out.println("ingrese un numero: ");
        //String nStr = sc.nextLine();
        int nEntero=0;
        try {
            nEntero = sc.nextInt(); //recibo solo enteros, hace el parseo
        }catch(InputMismatchException e){ //importo la excepcion
            System.out.println("Error, ingrese un n entero");
            main(args);
            System.exit(0);
        };
        System.out.println("numero ingresado: " +nEntero);


    }
}
