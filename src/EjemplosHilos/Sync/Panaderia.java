package EjemplosHilos.Sync;

public class Panaderia {
    private String pan;
    private boolean disponible;


    public synchronized  void hornear(String masa){

        //esperar q el consumidor compre pan, q disponible pase a falso para fabricar de nuevo
        while(disponible){ //la primera vez es falso
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.pan = masa;
        System.out.println("Horneando "+this.pan);
        this.disponible =true;
        notify(); //avisar al cliente
    }


    public synchronized String consumirPan(){
        while(!disponible){
            try {
                wait(); //esperar a q se hornee el pan
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente come pan " + this.pan);
        this.disponible =false;
        notify();
        return pan;
    }

}
