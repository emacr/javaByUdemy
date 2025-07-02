package EjemplosHilos.Executor;


import java.util.concurrent.*;

public class EjemploFuture {
    public static void main(String[] args) {

        // Executor    //solo una tarea y listo

        //executorService ofrece mas funcionalidad

        /// FUture es para dar trasabilidad a una tarea

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

        Callable<Integer> tarea2 =() -> {
            System.out.println("inicio de tarea 2");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<Integer> resultado1 = executor.submit(tarea2);


        //pasar la tarea al ejecutor
        Future<?> resultado= executor.submit(tarea);

        executor.shutdown(); //terminar el proceso una vez todas las tareas finalicen
        System.out.println(resultado.isDone()); //false

        while(!resultado1.isDone()){
            System.out.println(String.format("resultado1: %s", resultado1.isDone()  ? "finalizo" : "en proceso"));
            try {
                TimeUnit.MILLISECONDS.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
