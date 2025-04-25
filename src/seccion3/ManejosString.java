package seccion3;

public class ManejosString {

    public static void main(String[] args) {
        String curso = "Programacion Java"; //ojeto string asignado a variable curso (tipo especial), se crea de forma explicita
        String str = new String("hola"); //de esta forma se hace por detras, se crea de forma implicita
        //metodo de comparacion para strings

        boolean igual = curso.equals(str);
        System.out.println(igual);

        //comparacion ignorando mayus o minus
        //curso.equalsIgnoreCase(str);

        




    }
}
