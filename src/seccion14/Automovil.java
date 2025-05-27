package seccion14;

import java.util.Arrays;

/**
 * Class Automovil
 */
public class Automovil  {

  //relaciones de objetos
  private Motor motor;
  private Tanque capacidadTanque;
  private Persona dueno;
  private Rueda[] ruedas;


  //constructor vacio

  public Automovil() {
  }

  //constructor con parametros

  public Automovil(Motor motor, Tanque capacidadTanque, Persona dueno, Rueda[] ruedas) {
    this.motor = motor;
    this.capacidadTanque = capacidadTanque;
    this.dueno = dueno;
    this.ruedas = ruedas;
  }

  //get y set


  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public Tanque getCapacidadTanque() {
    return capacidadTanque;
  }

  public void setCapacidadTanque(Tanque capacidadTanque) {
    this.capacidadTanque = capacidadTanque;
  }

  public Persona getDueno() {
    return dueno;
  }

  public void setDueno(Persona dueno) {
    this.dueno = dueno;
  }

  public Rueda[] getRuedas() {
    return ruedas;
  }

  public void setRuedas(Rueda[] ruedas) {
    this.ruedas = ruedas;
  }

  //metodos
  public String verDetalles(){
    return "cilindrada: "+this.motor.getCilindrada();
  }

  public String verDetalleLLantas() {
    String detalle = ""; // Variable para almacenar el resultado
     if (getRuedas() != null) {
      detalle += "Ruedas del auto:";
      for (Rueda r : this.getRuedas()) {
        detalle += "\nFabricante: " + r.getFabricante() +
                ", Aro: " + r.getAro() +
                ", Ancho: " + r.getAncho();
      }
    }
    return detalle; // Retornás el String construido
  }

  @Override
  public String toString() {
    return "Automovil{" +
            "motor=" + motor +
            ", capacidadTanque=" + capacidadTanque +
            ", dueno=" + dueno +
            ", ruedas=" + Arrays.toString(ruedas) +
            '}';
  }
}
