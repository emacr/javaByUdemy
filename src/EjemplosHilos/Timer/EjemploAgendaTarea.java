package EjemplosHilos.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendaTarea {
    public static void main(String[] args) {


        //clase timer permite agregar tareas y programarlas
        Timer timer = new Timer(); ///import de java.util

        timer.schedule(new TimerTask() {

            private int contador=3;

            @Override
            public void run() {
                if (contador > 0) {
                    System.out.println("tarea realiza en "+new Date().toString() +" nombre del Thread: " +Thread.currentThread().getName());
                    contador --;
                }else{
                    System.out.println("finaliza el tiempo");
                    timer.cancel(); //detener la tarea
                }

            }
        },5000, 10000); //2 parametro delay en este caso, tarea se reite cada 10 segundos
        System.out.println("Tarea agendada para 5 segundos mas ...");

    }
}
