package com.mcarranza.app.jardin;

import com.mcarranza.app.hogar.Persona;

public class Perro {
    //es del mismo package entonces se puede dejar protected
    protected String nombre;
    protected String raza;


    //metodo
    //relacion de dependencia:
   /* el perro recibira una intancia de persona para q la persona
    juegue con el :
    public String lanzarPelota(){
        return "lanza la pelota";
    }
    */

    //metodos
    //este se crea con modiificar default, no sera publico ya q la idea es q el perro solo juegue en el jardin(package)

    String jugar(Persona persona){
    //import  persona
        return persona.lanzarPelota();
    }





}
