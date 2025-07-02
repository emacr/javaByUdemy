package colecciones.EjemplosSet;

import java.util.HashSet;

public class HashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"corvina","Lenguado","atun","Robalo","atun"};

        //registrar elemetnto en un set

        HashSet<String> unicos = new HashSet<>();

        for(String pez: peces){
            //hashset retorna bool
            if(!unicos.add(pez)){ //no es unico?
                System.out.println("Elemento "+pez+" duplicado.");
            }
        }
        //mostramos elemntos unicos
        System.out.println(unicos.size() + "elementos unicos: "+unicos);



    }
}
