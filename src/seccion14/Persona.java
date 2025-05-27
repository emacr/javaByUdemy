
package seccion14;

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private String Nombre;
  private String Apellido;
  
  //
  // Constructors
  //
  public Persona () { };

  public Persona(String nombre, String apellido) {
    Nombre = nombre;
    Apellido = apellido;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Nombre
   * @param newVar the new value of Nombre
   */
  public void setNombre (String newVar) {
    Nombre = newVar;
  }

  /**
   * Get the value of Nombre
   * @return the value of Nombre
   */
  public String getNombre () {
    return Nombre;
  }

  /**
   * Set the value of Apellido
   * @param newVar the new value of Apellido
   */
  public void setApellido (String newVar) {
    Apellido = newVar;
  }

  /**
   * Get the value of Apellido
   * @return the value of Apellido
   */
  public String getApellido () {
    return Apellido;
  }

  //
  // Other methods
  //

}
