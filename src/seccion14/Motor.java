package seccion14;

public class Motor {
    private double cilindrada;
    private TipoMotor tipo;



    //constructor vacio

    public Motor() {
    }

    //constructor lleno
    public Motor(double cilindrada, TipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }


    //get y set
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }


    //sobreescribo como quiero q se imprima cuando llame a toyota.getMotor()
    @Override
    public String toString() {
        return "toString: Motor de " + cilindrada + "L, tipo " + tipo;
    }
}
