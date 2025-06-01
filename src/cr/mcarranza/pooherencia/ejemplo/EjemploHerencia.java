package cr.mcarranza.pooherencia.ejemplo;

//importo ya que esta clase este en distinto paquete
/*import cr.mcarranza.pooherencia.Alumno;
import cr.mcarranza.pooherencia.Profesor;*/
import cr.mcarranza.pooherencia.*; //importo todas las clases


public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno a = new Alumno("ana","ROjas",33,"ana@gmail.com","INA",88.4,55.3,66.3);

        System.out.println(a.getNombre());

        Profesor p =  new Profesor("Carlos","mena",13,"an@gmail.com");
        p.setAsignatura("mate");

        System.out.println(p); //solo imprimo p x el to string modificado

       // AlumnoExtranjero ae = new AlumnoExtranjero("ada","wong",44,"ada@gmail.com","INA",0,0,0,"Alemania",44.3);
        AlumnoExtranjero ae = new AlumnoExtranjero();
        ae.setNombre("Pedro");
        ae.setPais("Alemania");
        ae.setNotaIdiomas(90.4);

        System.out.println(ae);






    }
}
