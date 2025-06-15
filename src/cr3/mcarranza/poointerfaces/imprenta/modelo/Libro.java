package cr3.mcarranza.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro  implements Imprimible{

    //en este caso libro no pude heredear de hoja ya q no es una hoja
    //creo clase pagina (de libro) para heredar de hoja

    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero; //enum


    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>(); // inicializo el array
    }
//metodo add
    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n").append("autor: ")
                .append(this.autor).append("\n").append("Genero: ")
                .append(this.genero).append("\n");
        //mostrar las paginas
        for(Hoja pg: this.paginas){
            sb.append(pg.imprimir()).append("\n");
        }
        return sb.toString();
    }

    //este metodo en la interfaz es default por lo tanto no estamos hobligados a heredarlo
    @Override
    public String imprimibleDefault() {
        return Imprimible.super.imprimibleDefault();
    }
}
