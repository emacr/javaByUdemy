package seccion8;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class tarea {
    public static void main(String[] args) {
        /*
        *  ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo
        *  java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
        * */

        Calendar calendario = Calendar.getInstance();


        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");
        String fechaNacimiento =  JOptionPane.showInputDialog("Ingrese la fecha de nacimiento: ");

//        try {
//
//            long fecha = Date.parse(fechaNacimiento) ;
//            //Date fecha = format.parse(fechaNacimiento);
//            Date fechaActual = calendario.getTime();
//
//            //int edad = fecha - fechaActual;
//
//            System.out.println("fecha de nacimiento: " +fecha);
//            System.out.println("fecha actual: "+fechaActual);
//
//
//
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//
//

    }
}
