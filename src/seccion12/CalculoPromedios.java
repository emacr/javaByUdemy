package seccion12;

import java.util.Scanner;

public class CalculoPromedios {
    public static void main(String[] args) {
        double [] mate,historia,ingles;
        mate = new double[7];
        historia = new double[7];
        ingles = new double[7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las notas de mate: ");

        for(int i=0; i<mate.length;i++){
            mate[i] = sc.nextDouble();
        }

        System.out.println("Ingrese las notas de historia: ");

        for(int i=0; i<historia.length;i++){
            historia[i] = sc.nextDouble();
        }
        System.out.println("Ingrese las notas de ingles: ");

        for(int i=0; i<ingles.length;i++){
            ingles[i] = sc.nextDouble();
        }

        //calcular promedio
        int sumNMate=0, sumNHistoria=0,sumNIngles=0;

        //iterar los 7 alunmos

        for(int i =0; i <7;  i++){
            sumNMate +=  mate[i];
            sumNHistoria +=  historia[i];
            sumNIngles +=  ingles[i];
        }

        double promedioMate = sumNMate/mate.length;
        double promedioHisto = sumNHistoria/historia.length;
        double promedioIng = sumNIngles/ingles.length;

        double promedioTotal  = (promedioMate+promedioHisto+promedioIng)/3;

        System.out.println(promedioTotal);

        //buscar una nota de un alumno
        System.out.println("Ingrese el id del estudiante del 0 al 6");
        int id = sc.nextInt();

        double promedioAlumno = (mate[id]+historia[id]+ingles[id])/3;
        System.out.println("promedio del alumno "+id+" es de: "+promedioAlumno);




















    }
}
