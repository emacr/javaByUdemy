package EjemplosHilos;

import EjemplosHilos.Runnable.ViajeTares;

public class EjemploInterfaceRunnableFuncional {
    public static void main(String[] args) {

        Runnable viaje = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i< 5;i++){
//                    System.out.println(i+" / " +nombre);
                    System.out.println(i+" / " +Thread.currentThread().getName()); //accedo al hilo q se este ejecutando y al nombre

                    try {
                        Thread.sleep(1000); //en espera
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Finaliza, me voy de viaje a "+Thread.currentThread().getName());

            }
        };

        //instancio
    //    new Thread(new ViajeTares("panama")).start();

        new Thread(viaje, "panama").start();
        new Thread(viaje, "cuba").start();
        new Thread(viaje,  "peru").start();




    }
}
