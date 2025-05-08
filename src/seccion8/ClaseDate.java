package seccion8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {
    public static void main(String[] args) {
        //creo instancia de la clase date
        Date fecha = new Date();
        System.out.println("fecha = " + fecha); //fecha actual

        //customizar date
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy"); //ver standar para agregar formatos (buscar sinmple date format java 21 o la version q sea en google
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);


        //get time obtener datos en milisegundos

        


    }
}
