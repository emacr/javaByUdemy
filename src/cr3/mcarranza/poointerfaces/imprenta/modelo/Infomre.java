package cr3.mcarranza.poointerfaces.imprenta.modelo;

public class Infomre extends Hoja implements Imprimible{

    private String autor;
    private String revisor;

    public Infomre(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: "+ this.autor+
                "Revisado por: "+this.revisor+"\n"+this.contenido;

    }


}
