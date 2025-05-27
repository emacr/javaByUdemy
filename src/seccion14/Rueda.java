
package seccion14;

/**
 * Class Rueda
 */
public class Rueda {

  //
  // Fields
  //

  private String fabricante;
  private int aro;
  private double ancho;
  
  //
  // Constructors
  //
  public Rueda () { };

  //creo constuctor lleno para evitar usar los set, solo los get
  //una forma de hacerlo

  public Rueda(String fabricante, int aro, double ancho) {
    this.fabricante = fabricante;
    this.aro = aro;
    this.ancho = ancho;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //


  /**
   * Get the value of Fabricante
   * @return the value of Fabricante
   */
  public String getFabricante () {
    return fabricante;
  }


  /**
   * Get the value of Aro
   * @return the value of Aro
   */
  public int getAro () {
    return aro;
  }


  /**
   * Get the value of Ancho
   * @return the value of Ancho
   */
  public double getAncho () {
    return ancho;
  }

  //
  // Other methods
  //

}
