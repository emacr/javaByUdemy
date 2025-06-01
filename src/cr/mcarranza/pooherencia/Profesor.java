package cr.mcarranza.pooherencia;

public class Profesor extends Persona{
    //atributos propios de profesor
    private String asignatura;

    //constructor
    public Profesor(String nombre, String apellido, int edad, String email, String asignatura) {
        super(nombre, apellido, edad, email);
        this.asignatura = asignatura;
    }

    //constructor vacio

    public Profesor(String nombre, String apellido, int edad, String email) {
        super(nombre, apellido, edad, email);
    }


    //get y set

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesor: " +this.getNombre()+
                " ,asignatura='" + this.asignatura + '\''
                ;
    }
}
