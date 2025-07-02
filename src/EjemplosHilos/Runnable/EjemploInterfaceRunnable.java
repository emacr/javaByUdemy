package EjemplosHilos.Runnable;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        //instancio
        new Thread(new ViajeTares("panama")).start();
        new Thread(new ViajeTares("cuba")).start();
        new Thread(new ViajeTares("peru")).start();


    }
}
