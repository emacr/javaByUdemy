package seccion13;

import javax.imageio.ImageTranscoder;

public class MatrizColumnaVariable {
    public static void main(String[] args) {

        //columnas variables
        int [][] n = new int[3][]; //dejo vacio las columnas

        n [0]= new int[2]; //2 columnas
        n [1]= new int[3]; //3 columnas
        n [2]= new int[4]; //4 columnas


        //llenar matrizz
        for (int i=0; i<n.length;i++){
            for(int j=0; j < n[i].length;j++){
                n[i][j] = i*j;
            }
        }


//recorrer matriz
        for(int i=0; i<n.length;i++){
            for(int j=0; j<n[i].length;j++){
                System.out.print(n[i][j] +" \t");
            }
            System.out.println();
        }








    }
}
