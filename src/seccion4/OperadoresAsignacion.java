package seccion4;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        //operador asignacion =
        int i=5;

        //operadores combinados
        i +=2;

        //concatenacion compuesta
        String sqString = "select * from clientes as c";
        sqString += "where c.nombre == 'Andres'";
        sqString += "and c.activo=1";




    }
}
