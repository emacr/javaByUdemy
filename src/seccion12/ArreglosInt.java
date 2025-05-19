package seccion12;

public class ArreglosInt {
    public static void main(String[] args) {
        //crear con instancia
        int[] numeros = new int[3];
        //asignar datos
        numeros[0]=9;
        numeros[1]=Integer.valueOf("8"); //puedo pasar un valor de string
        numeros[2]=4;

        //ver datos
        for(int n:numeros){
            System.out.println("n = " + n);
        }

       // System.out.println(numeros);




    }
}
