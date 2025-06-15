package cr3.mcarranza.poointerfaces.imprenta.modelo;

public interface Imprimible { //en lugar de class es interface

    //siempre publico
    public  String imprimir();

    //metodos publcios de igual manera

    //interfaces default no son necesarias q las hereden los hijos, no es hbligatori
    //una interfaz puede tener varias funciones y no todas tienen q ser heredadas

    default String imprimibleDefault(){
        return "Imprimible por default";
    }






}
