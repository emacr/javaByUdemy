package seccion11;

public class ArgsLineaComandos {
    public static void main(String[] args) {
        for (int i=0; i < args.length; i++){
            System.out.println("argumentos " +i +": " + args[i]);
        }
    }
}
