package EjemplosHilos.Runnable;

public class ViajeTares implements Runnable{ //implemento interfaz

    private String nombre;

    public ViajeTares(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for(int i=0; i< 5;i++){
            System.out.println(i+" / " +nombre);
            try {
                Thread.sleep(1000); //en espera
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finaliza, me voy de viaje a "+nombre);

    }
}
