package javaGenerics;

public class Genericos <T>{ //represnto con T la clase para q sea generica

    //T = tipo de dato

    //generics me permite almacenar contenidos de diferentes tipo (int,string, etc...)

    //puedo reutilizar el contenido con diferentes datos
    private T contenido; //no le pongo el tipo de dato ya q puede ser de diferentes tipos

    public void ponerAlgo(T contenido){
        this.contenido = contenido;
    }
    public T obtenerValor(){
        return contenido;
    }

    //comodines (solo se puden utlizar en el tipo list)






}
