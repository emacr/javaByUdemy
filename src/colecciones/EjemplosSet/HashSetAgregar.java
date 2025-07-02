package colecciones.EjemplosSet;

import java.util.HashSet;

public class HashSetAgregar {
    public static void main(String[] args) {
        //instancia de un set
        HashSet<String> hs = new HashSet<>();

        /* no ordena los elementos
        no permite repetidos
        los set no se pueden ordenar, para hacerlo hay  q convertirlo a araylist

         */

        //agregar elementos
        hs.add("Uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");


        System.out.println( hs);





    }
}
