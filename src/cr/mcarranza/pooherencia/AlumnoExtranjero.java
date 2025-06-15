package cr.mcarranza.pooherencia;

public class AlumnoExtranjero extends Alumno{

    private String pais;
    private double notaIdiomas;

//constructor
    //hereda de alumno q a su vez hereda de persona, es decir todos los atributos de ambos estaran aca
    public AlumnoExtranjero(String nombre, String apellido, int edad, String email, String institucion, double notaMate, double notaIngles, double notaHistoria, String pais, double notaIdiomas) {
        super(nombre, apellido, edad, email, institucion, notaMate, notaIngles, notaHistoria);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    //constructor vacio
    public AlumnoExtranjero(){};

    //get y set
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }


    @Override
    public String toString() {
        return "Nombre: " +this.getNombre()+
                ", pais:' " + pais + '\'' +
                ", notaIdiomas: " + notaIdiomas
                ;
    }

    //metodos
    //metodo del padre Persona


    @Override
    public String saludar() {
      //  return super.saludar()+" ,soy alumno internacional de "+getPais();
      //si dejo el super por defecto me concatena lo q tenga la herencia
        return "hi, soy alumno internacional de "+getPais(); //asi lo modifico sin q me salga lo q tiene escrito la clas padre

    }
}
