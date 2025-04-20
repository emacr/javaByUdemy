public class primtivosFloat {
    //atributo variable de la clase
    //paraq se pueda utilizar dentro de un metodo static esta debe ser static
    static float varFloat;

    public static void main(String[] args) {
        float nFloat = 2200F;
    //notaciones cientificas para compactar numreros grandes
        float n2= 1.5e-10f; //= 0,000000000015f

        //constantes de float, q tienen mas funcioanlidades

        System.out.println("float corresponde a byte: "+Float.BYTES);
        System.out.println("maximo valor de float: "+Float.MAX_VALUE);

        //doble presicion
        double nd= 3.14161824103D;
        System.out.println("double valor de byte: "+Float.BYTES);

        //recordar var es dinamica, es decir reconoce q tipo de variable voy a usar
        var varFloat = 3.1416f;
        System.out.println(" valor de var de byte: "+Float.BYTES);

        //valores por defecto de los primitvos = 0

        System.out.println(" valor por defecto: "+varFloat);

    }
}
