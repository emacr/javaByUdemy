package seccion3;

public class ConcatenarStrings {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres";

        String detalle = curso + " con el profe " + profesor;

        //las expresiones se evaluan de izquierda a derecha
        //a menos q le pongamos preferencia, por ejemplo con ()
        int n=10;
        int n2=12;
       // System.out.println(detalle + (n+n2));

        //metodo de string para concatenar
        curso.concat(detalle);

        //los strings son inmutables
        //otra funcion de concatenar pero mas eficiente utliza expresiones lambda
        curso.transform((cursos) -> {//recibe una funcion
            return cursos + " con " +profesor; //no se altero solo mantiene curso
        });
        System.out.println(curso);

        //test de rendimiento en concatencion
        String a ="a";
        String b ="b";
        String c ="a";

        //loop for para concatenar tomando en cuenta tiempo inicio y fin

        //stringbuilder permite crear string, es mutable
        StringBuilder sb = new StringBuilder(a);

        //tiempo inicial
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n"); 2 milesgundo tardo
            //c += a +b+"\n"; 19 milesgundo tardo
            //sb.append(a).append(b).append("\n"); 0 milesgundo tardo

        }
        //tiempo final
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println(sb.toString());



    }

}
