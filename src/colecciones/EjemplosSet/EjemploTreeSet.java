package colecciones.EjemplosSet;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        //mal rendimiento ya q tienen q ordenar
        //ordena de forma alfabetica, no en el orden q se registra
        //no acepta duplicados
        //ordena ascedente los numeros

        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println(ts);





    }
}
