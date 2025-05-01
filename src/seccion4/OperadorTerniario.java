package seccion4;

import java.util.Scanner;

public class OperadorTerniario {
    public static void main(String[] args) {
        //este operadorevalua una condicional true or false
        //ternario=formado por 3 elementos
        //version abreviada del if else

        //tipo dato y vriable= condicion  ? se cumple?si : nodevuelveOtroValor
        String n = 7==7 ? "verdadero" : "Falso";
        System.out.println(n);
        
        String estado=" ";
        double promedio = 5.2;
        
        estado = promedio >= 6 ? "Aprobado":"Reprobado";

        System.out.println("estado = " + estado);

        //ejercicio

        double promedio2 =0.0;
        double mate = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de mate entre 2 y 7: ");
        mate =  sc.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2 y 7: ");
        ciencias =  sc.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2 y 7: ");
        historia =  sc.nextDouble();

        promedio2 = (mate + ciencias + historia)/3;
        System.out.println(" promedio " + promedio2);

        estado = promedio2 >= 5.49 ? "Aprobado":"Reprobado";

        System.out.println("el estado del estudiante es: "+estado);


        //ejercicio

        int max = 0;

        System.out.println("Ingrese un numero: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese un numero: ");
        int n2 = sc.nextInt();
        System.out.println("Ingrese un numero: ");
        int n3 = sc.nextInt();

        max = (n1>n2) ? n1:n2;
        max = (max>n3) ? max:n3;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("mayor" + max);










    }
}
