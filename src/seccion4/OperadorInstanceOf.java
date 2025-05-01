package seccion4;
public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto= "creando un objeto de la clase string ... que tal!";

        Integer num = 7;

        Boolean b1 = texto instanceof String && texto instanceof Object;

        System.out.println("es del tipo string y object? = " + b1);

        //clase object = clase padre de todos los objetos

        b1 = num instanceof Integer;
        b1 = num instanceof Number;
        b1 = num instanceof Object;

        //instanceof con tipos abstractos

        //predencia de los operadores




    }
}
