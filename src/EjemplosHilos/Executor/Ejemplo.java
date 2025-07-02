package EjemplosHilos.Executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ejemplo {
    public static void main(String[] args) {

        // Executor    //solo una tarea y listo

        //executorService ofrece mas funcionalidad

        ExecutorService executor = Executors.newSingleThreadExecutor();


        //aplico funcion lambda (opcional)
        Runnable tarea = () -> {
            System.out.println("Inicio la tarea");
            //espera de 5 segundos
            try {
                TimeUnit.SECONDS.sleep(5); // lo mismo q Tread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();

            }
            System.out.println("Finaliza tarea");
        };

        //pasar la tarea al ejecutor
        executor.submit(tarea);
        executor.shutdown(); //terminar el proceso una vez todas las tareas finalicen





    }
}
