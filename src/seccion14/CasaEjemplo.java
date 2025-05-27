package seccion14;

import java.awt.image.BufferedImageFilter;
import java.util.Date;

public class CasaEjemplo {
    public static void main(String[] args) {

        Date fecha = new Date();

        Casa home = new Casa("bajo castillo",1,Casa.COLOR_AMARILLO); //paso la constante de color creada con final para 3vitar errores

        System.out.println(home.detalle());
        System.out.println("cantidad de pisos: "+home.getPisos());
        System.out.println("numero de casa: "+Casa.NUMERO_CASA); //se llama desde la clase

        home.setColor("amarillo");
        System.out.println("Nuevo color: "+home.getColor());

        Casa soda = new Casa(); //sin parametros gracias al constructor vacio q cree
        //soda.setColor(Casa.COLOR_ROJO); //puedo pasar la constante tambien
        soda.setColor("verde");
        System.out.println(soda.detalle());

        System.out.println("mismo color? "+home.equals(soda)); //el metod q sobreescribi compara por color

        //acceder al atributo static y modificarlo
       // Casa.zinc="liso"; cuando es publico
        //ahora q es privado:
        Casa.setZinc("liso");

        System.out.println(Casa.getZinc());

        Casa edificio = new Casa();
        edificio.setColorEdificio(Color.AZUL); //agrego el valor com el enum COLOR creado
        System.out.println("color edificio: "+edificio.getColorEdificio());
        System.out.println(edificio.detalleEdificio());

        Casa precario = new Casa();
        precario.setTipo(TipoVivienda.NO_APTA); //llamo al enum q tiene datos
        System.out.println("precario: "+precario.getTipo());

        TipoVivienda tipoPrecario = precario.getTipo();
        System.out.println("tipo precario: "+tipoPrecario.getDescripcion2());





    }
}
