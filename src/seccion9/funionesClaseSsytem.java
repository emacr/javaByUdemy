package seccion9;

public class funionesClaseSsytem {
    public static void main(String[] args) {
        int n;
        try{
            System.out.println(" Ingrese un nuemro: ");
        } catch (Exception e) {
          //  throw new RuntimeException(e);
            //dar mensaje de error con .err en lugar de .out
            System.err.println("no es un entero" +e.getMessage()); //obtengo mensaje mas claro

            //cuando hay errores pudeo colocar
            System.exit(1); //1 es para cuando hay error y termina toda la ejecucion
                                    // 0 es cuando no hay error
            //ojo
            //puedo salirme o quitar el exit y volver a ir al main como un ciclo
            main(args);

        }

        //eliminar todas las instancias q no se esten utilizando
        //invocar de forma explicita puede ser al final o en medio de la aplicacion
        System.gc(); //forzamos el proceso / opconal




    }
}
