import javax.swing.*;

public class EntradaDatos {
    public static void main(String[] args) {
        //mostrar ventana de dialogo
        //int nDecimal = (showInputDialog(null, "Ingrese un numero: "); //con esto recibimos un string pero necesitamos un entero
       // int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrse un numero: "));

       // String mensaje = "n octal: " +n+ "=" +Integer.toOctalString(n);

        //mostrar ventana de mensaje
        //JOptionPane.showMessageDialog(null,mensaje);
        //--------------------------------------//
        //manejo de excepciones try catchy
        String nStr = JOptionPane.showInputDialog(null,"Ingrese un valor: ");
        int numero=0;
        try{
            //tratar de hacer algo
            numero = Integer.parseInt(nStr);

        }catch(NumberFormatException e){ //parametros q va a recibir
            //captura errores
            JOptionPane.showMessageDialog(null,"error, ingrese n entero");
            //reinvoco el main de forma recursiva
            main(args);
            System.exit(0); //todo salio sin problema, termina ejecucion
        }
        System.out.println("Terminado con exito");
    }

}
