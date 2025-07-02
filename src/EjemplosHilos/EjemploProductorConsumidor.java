package EjemplosHilos;

import EjemplosHilos.Runnable.Consumidor;
import EjemplosHilos.Runnable.Panadero;
import EjemplosHilos.Sync.Panaderia;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {

        Panaderia p = new Panaderia(); //panadero y consumidor comparten panaderia
        new Thread(new Panadero(p)).start(); //ornea
        new Thread(new Consumidor(p)).start(); //consumes







    }
}
