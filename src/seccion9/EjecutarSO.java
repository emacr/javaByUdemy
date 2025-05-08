package seccion9;

public class EjecutarSO {
    public static void main(String[] args) {

        //permite ejecutar apps con el metodo exc
        Runtime rt = Runtime.getRuntime();

        Process proceso;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");
                //linux
            }else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
            System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            }
             else{
                proceso = rt.exec("gedit"); // ejecuta el textedit de linux
            }
            proceso.waitFor(); //esperar a ser cerrado
        }catch (Exception e){
            System.err.print("Comando desconocido" +e.getMessage());
            System.exit(1);
        }
        System.out.println(" se ha cerrado el editor");
        System.exit(0);


    }
}
