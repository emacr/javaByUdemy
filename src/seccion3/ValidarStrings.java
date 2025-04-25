package seccion3;

public class ValidarStrings {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        boolean esNulo2 = curso.length()==0;
        boolean esnulo3 = curso.isEmpty();
        boolean esNulo4 = curso.isBlank(); //valida mas a profundidad

        //usar por ejemplo para validar un formulario q no se envie vacio
        //se puede haccer com if

        //cuando un objrto es null no se puede ejecutar los metods
        //ej -> curso.toUpperCase();

        if (!esNulo){ //no es null
            System.out.println(curso.toUpperCase());
        }
        else{
            System.out.println("es null");
        }



    }
}
