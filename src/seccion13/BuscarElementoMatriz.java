package seccion13;

public class BuscarElementoMatriz {
    public static void main(String[] args) {
        int[][] n = {
                {36,90,3,1978},
                {15,2020,10,5},
                {677,127,32767,1999}
        };

        int buscar = 10;
        boolean encontrado = false;
        int i=0; //for1
        int j= 0; //for2

        //recorrer filas
        buscar: //pongo etiqueta para pasarle al break
        for (i=0; i < n.length;i++){
            //recorro columnas
            for (j=0; j < n[i].length; j++){
                if (n[i][j] == buscar){
                    encontrado=true;
                    break buscar; //paso etiqueta para salirme de los 2 for, ya q sino solo me salgo del ultimo
                }
            }
        }
        if(encontrado){
            //para usar i y j inicializo los 2 fuera del for para poder usarlos
            System.out.println("numero "+buscar+" encontrado en la posicion "+i+" , "+j);
        }else{
            System.out.println("no encontrado");
        }








    }
}
