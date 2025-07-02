package EjemplosHilos;

import EjemplosHilos.Runnable.ImprimirFrases;

public class EjemploSincronizacionHilos {
    public static void main(String[] args) throws InterruptedException {

//sincronizacion de hilos: parq  no accedan al mismo tiempo a un recurso
//sino se puede mezclar e imprimir los datos sin sentido


        new Thread(new ImprimirFrases("hola ","mundo")).start();
        new Thread(new ImprimirFrases("adios ","mop")).start();
        //pausa
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrases("de ","nada"));
        h3.start();
        System.out.println(h3.getState());

    }

    //metodo
//    public static void imprimirFrases(String frase1, String frase2) throws InterruptedException {
    public synchronized static void imprimirFrases(String frase1, String frase2) { //de  esta manera esta sincronizado
//al sincronizarse entra de uno a uno, esperando a q uno termine para entrar el q sigue
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        System.out.println(frase2);
    }


}
