package EjemplosHilos.Runnable;

import EjemplosHilos.Sync.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable{

    private Panaderia panaderia; //atributo de la clase panaderia

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        //ornear 10 panes
        for(int i=1; i<=10; i++){
            panaderia.hornear("Pan: "+i);
            //simular una pausa por cada pan
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000)); //random
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
