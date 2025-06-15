package cr2.mcarranza.pooclasesabstractas.form.elementos;

import cr2.mcarranza.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones; //list del tipo opcion (clase opcion)

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>(); //inicializo el array
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    //get y set

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("'<select ");
        sb.append("name: ").append(this.nombre).append("'>");

        for(Opcion opc:this.opciones){
            sb.append("\n <option value= ").append(opc.getValor()).append("'");

            if(opc.isSelected()){
                sb.append("selected");
                this.valor = opc.getValor();
            }
            sb.append(">").append(opc.getNombre()).append("</option>");

        }
        sb.append("</selected>");
        return sb.toString();
    }


    //opcional para agregar datos en lugar dell set
    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }


}
