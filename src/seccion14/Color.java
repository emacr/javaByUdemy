package seccion14;

public enum Color {
    //coleccion de atributos constantes

    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("azul oscuro"),
    NARANJA("naranja");

//personalizar los nombres que se muestran en los datos
    private final String color;

    //creo constructor
    Color(String color) {
        this.color = color;
    }


    //get color
    public String getColor() {
        return color;
    }

//    @Override
//    public String toString() {
//        return this.color;
//    }
//al colocar esto digo q haga referencia a la contanste q coloco ("azul oscuro"), asi no haria falta usar el getcolor en la clase donde lo invqque

}
