package EjemplosHilos.Thread;

public class EjemploExtenderThread {
    public static void main(String[] args){

        //instanciar
        Thread hilo = new NombreThread("Emma y Ana");
        System.out.println(hilo.getState()); //new
        hilo.start();
      //  Thread.sleep(100); //colocar en el main throws InterruptedException
        System.out.println(hilo.getState()); //Runnable

        Thread hilo2 = new NombreThread("Dani");
        hilo2.start();





    }



}
