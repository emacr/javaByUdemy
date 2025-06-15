package cr3.mcarranza.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class CV extends Hoja implements Imprimible{ //implements solo para heredar de interfaces

    private String persona;
    private String carrera;
    private List<String>Experiencias;


    public CV(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
       // Experiencias = experiencias;
        this.Experiencias = new ArrayList<>(); //inicializo el array
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<String> getExperiencias() {
        return Experiencias;
    }

    public void setExperiencias(List<String> experiencias) {
        Experiencias = experiencias;
    }



    //meotods
    public CV addExperiencia(String exp){
        Experiencias.add(exp); //agregar experiencia
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n").append("Resumen: ").append(this.contenido).append("\n")
                .append("carrera: ").append(this.carrera).append("\n")
                .append("Experiencias: \n");
        //iterar la experiencias
        for (String exp: this.Experiencias){
            sb.append(exp).append("\n");
        }
        return sb.toString();
    }
}
