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
    public Profesor(){};


    //get y set

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    //modifico la salida del mensaje q quiero mostrar
    @Override
    public String toString() {
        return "Profesor: " +this.getNombre()+
                " ,asignatura='" + this.asignatura + '\''
                ;
    }

    //metodos
    //metodo heredado del pdre Persona
    //clik derecho generate override methods

    @Override
    public String saludar() {
        return super.saludar() + " ,soy un profesor de "+getAsignatura()+" y mi nombre es: "+getNombre();
    }
}
