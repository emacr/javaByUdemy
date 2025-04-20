public class PrimitivosChar {
    public static void main(String[] args) {
        //char 1 solo caracter
        char caracter = 'a'; //comilla simple, para string es comilla doble ""
        //puedo tener numeros de 0 al 9
        //char basado en unicode
        //ver tablas unicode para mas detalles
        //para colocar caracter unicode coloco \y el caracter
        char arroba= '\u0040';
        char arro2 = 64;

        System.out.println("arro1 = arro2 = " + (arroba == arro2) ); //operador de relacion ==
        //igual q en mate por ejemplo se enciera entre () para decir q haga esa operacion primero y depsues el resto

        System.out.println(" char corresponde a byte: " +Character.BYTES);

        //caracteres especiales
        char retroceso = '\b';
        char espacio = '\u0020';
        char tabulador = '\t';
        char nuevaLinea = '\n';

        //segun sistema operativo no reconoce algunos de los caracteres
        //en java puedo invocar desde system una propiedad q coloco la instruccion y el tomara el caracter q corresponda
        System.out.println(" char corresponde a byte: " + System.getProperty("line.separator") +Character.BYTES);
        //O tambien tenemos el metodo
        System.lineSeparator();



    }
}
