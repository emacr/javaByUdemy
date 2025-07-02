package EjemplosHilos.Runnable;

import EjemplosHilos.Sync.Panaderia;

public class Consumidor implements Runnable{

    private Panaderia panaderia; //atributo de la clase panaderia

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        //el panadero crea 10 panes
        //el consumidor debe comprar los 10 panes
        for(int i=1; i<=10;i++){
            panaderia.consumirPan();

        }

    }
}
