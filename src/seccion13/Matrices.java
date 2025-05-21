package seccion13;

public class Matrices {
    public static void main(String[] args) {
        //declaracion de matriz
        //fila colunma

        int [][] n = new int[2][4];

        //llenar matriz
        //fila 1
        n[0][0]= 20;
        n[0][1]= 30;
        n[0][2]= 60;
        n[0][3]= 70;

        //llenar matriz
        //fila 2
        n[1][0]= 10;
        n[1][1]= 4;
        n[1][2]= 6;
        n[1][3]= 7;

        //ver numero de filas;
        System.out.println(n.length);

        //ver numero de columnas
        System.out.println(n[0].length);

        //ver primer elemento de la matriz
        System.out.println(n[0][0]);

        //ver el ultimo elemento
        System.out.println(n[n.length-1][n[0].length -1]);

        System.out.println("\t\t recorriendo matriz");

        for (int i=0; i<n.length;i++){
            for (int j=0; j<n[i].length;j++){
                System.out.print(n[i][j]);
            }
        }





    }
}
