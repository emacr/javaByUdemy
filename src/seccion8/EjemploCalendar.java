package seccion8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjemploCalendar {
    public static void main(String[] args) {

        //esta es una clase abstracta
        //no permite crear la instancia con el operador new

        Calendar calendarip = Calendar.getInstance();

        //indicar una fecha y hora especifica
        calendarip.set(2020, Calendar.AUGUST, 25, Calendar.HOUR, 20, 11); //el mes 0 es enero 11 es diciembre;


        Date fecha = calendarip.getTime();// retorna la fecha del dia
        System.out.println("fecha actual = " + fecha);

        //convertir string fecha a objeto tipo date
        System.out.println(" fecha con parse ");

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(" Ingrese una fecha con formato yyyy-MM-dd" );
        //necesita de un try catch
        try {
           // Date fecha2 = format.parse("2020-01-05"); //aqui el try valida el formato de fecha q defini en el format arriba
            Date fecha2 = format.parse(sc.next()); //fecha ingredasa por el usuario
            System.out.println("fecha2 = " + fecha2);
            System.out.println("format = " + format.format(fecha2));

            //comparar fechas
            //ver cual es mayor
            Date fecha3 = new Date();
            if(fecha2.after(fecha3)){
                System.out.println(" fecha es mayor q fecha actual");
            }else if(fecha2.before(fecha3)){
                System.out.println(" fecha es menor q fecha actual");
            } else if (fecha2.equals(fecha3)) {
                System.out.println("fechas son iguales");
            }


        }catch (ParseException e){
            e.printStackTrace();
        }





    }
}
