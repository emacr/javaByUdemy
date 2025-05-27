package com.mcarranza.app.jardin;
//importo la clase
import com.mcarranza.app.hogar.ColorPelo;
import com.mcarranza.app.hogar.Persona;

//importo todas las clases con * cuando son muchas
//import com.mcarranza.app.hogar.*;


//import estico de una clase
import static com.mcarranza.app.hogar.Persona.saludar;

//importo todo para no tener q importar cada cosa
import static com.mcarranza.app.hogar.Persona.*;

//puedo importar para pasar solo el color
import static com.mcarranza.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        //ahora ya puedo instanciar la clase por el import
        Persona p = new Persona();

        //get y set por el modificador de acceso private
        p.setNombre("ana");
        System.out.println(p.getNombre());

        ///color de pelo desde enum
        p.setColorPelo(ColorPelo.NEGRO);
        p.setColorPelo(ROJO); //con el import de pelo paso solo el color

        //las clases q esten en el mismo paquete q el main (perro) no es necesario hacer el import
        Perro perrou = new Perro();
        perrou.nombre="chessi";

        String jugando = perrou.jugar(p); //relacion de dependencias 

        System.out.println("jugando = " + jugando);

        // String saludo = Persona.saludar(); importo el metodo
        String saludo = saludar();
        String femenino = GENERO_FEMENINO;

    }
}
