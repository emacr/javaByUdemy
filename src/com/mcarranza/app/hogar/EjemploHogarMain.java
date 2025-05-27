package com.mcarranza.app.hogar;

import com.mcarranza.app.jardin.Perro;

public class EjemploHogarMain {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perrin = new Perro();

        /*
        perrin.jugar
        no lo puedo inovar ya q es privado
        es decir dentro de la casa no jugara, solo en el jardin
         */

        //no importp persona xq es parte del package
        String saludo = Persona.saludar();
    }

}
