package cr.mcarranza.pooherencia;

public class Alumno extends Persona{
   //atributos propios de alumno
    private String institucion;
    private double notaMate;
    private double notaIngles;
    private double notaHistoria;

    //constructor
    public Alumno(String nombre, String apellido, int edad, String email, String institucion, double notaMate, double notaIngles, double notaHistoria) {
        super(nombre, apellido, edad, email); //heredo los atributos del padre (Persona) con la palabra reservada Super
        //ahora van los atributos propios del alumno
        this.institucion = institucion;
        this.notaMate = notaMate;
        this.notaIngles = notaIngles;
        this.notaHistoria = notaHistoria;
    }

    //constructor vacio
    public Alumno(){};

//
//    public Alumno(){
//        super(); //llamar solo al constructor del padre
//    };


    //get y set
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    //metodos
    //sobre escritura de metodos heredado del padre

    @Override
    public String saludar() { //metodo del padre
        return super.saludar() + " ,soy un alumno y mi nombre es: "+getNombre();
    }




}
