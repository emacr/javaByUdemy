package EjemplosHilos.Thread;

public class NombreThread extends Thread{ //implemento herencia

    /*
    este es solo de ejemplo [ya q es mejor implementar Runnable q Thread
     */

    //para personalizar nombre paso constructor
    public NombreThread(String name)  {
        super(name);
    }

    //generate override
    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del hilo "+getName());
        for(int i=0; i<5;i++){
            System.out.println(this.getName());
        }
        System.out.println("Finaliza el thread");
    }
}
