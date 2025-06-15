package cr3.mcarranza.poointerfaces.imprenta.modelo;

//clase padre
public abstract class Hoja {

   protected String contenido;

   //constructor
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    //get y set
//    public String getContenido() {
//        return contenido;
//    }
//
//    public void setContenido(String contenido) {
//        this.contenido = contenido;
//    }

    //metodo abstracto
    abstract public String imprimir();


}
