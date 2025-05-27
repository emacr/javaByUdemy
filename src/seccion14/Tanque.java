package seccion14;


/**
 * Class Tanque
 */
public class Tanque {

  //
  // Fields
  //

  private int Capacidad;
  
  //
  // Constructors
  //
  public Tanque () {
    this.Capacidad =40; //variable ya definida
  };

  public Tanque(int capacidad) {
    Capacidad = capacidad;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //


  /**
   * Get the value of Capacidad
   * @return the value of Capacidad
   */
  public int getCapacidad () {

    return Capacidad;
  }

  //
  // Other methods
  //

}
