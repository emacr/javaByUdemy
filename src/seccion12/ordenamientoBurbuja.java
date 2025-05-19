package seccion12;

public class ordenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos = {"sal","manteca","abano","rabano","azucar"};

        int total = productos.length;
        for(int i=0; i < total -1; i++){ //el 1 es para q no itere en la ulatima posicion q deporsi estara vacia, es para optimizar
            for (int j=0; j<total-1 -i; j++){ //-1 x el j+1
                if(productos[j+1].compareTo(productos[j]) <0){ //comparamos los 2 siguientes elementos del 2 for
                    //intercambiamos posciones
                    //valor de i en j y valores de j en i
                    //variable auxiliar para guardar posicion q tiene i
                    String aux = productos[i];
                    productos[j]= productos[j+1];
                    productos[j+1]= aux;
                }
                //este asi no es muy eficiente, aqui si porq el arreglo es pequeno
            }
        }

        for(int i=0; i<total; i++){
            System.out.println(productos[i]);
        }





    }
}
