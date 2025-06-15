package cr.mcarranza.pooherencia;

final public class Director {
    //esta clase no puede tener clases hijas en herencias

    //puedo poner un metodo como final para q nose pueda sobreescribir
    //pero en una clase q no sea final, ya q si la clase es final no es necesario colocar final en metoodos
    final public String saludo(){
        return "hola";
    }


}
