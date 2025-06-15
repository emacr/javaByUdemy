package cr2.mcarranza.pooclasesabstractas.form.elementos;

//indico q es una clase abstracta
public abstract class ElementoForm {

    //varibales
    protected String valor;
    protected String nombre;

    //constructor vacio
    public ElementoForm(){};

    public ElementoForm(String nombre) {
        this(); //llama al constructor vacio
        this.nombre = nombre;
    }

    //set
    public void setValor(String valor) {
        this.valor = valor;
    }

    //para q un metodo sea abstracto, la clase tiene q ser abstracta

    //metodo abstracto
    public abstract  String dibujarHtml(); //el body, implementacion solo las tendran las clases hijas






}
