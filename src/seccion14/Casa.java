package seccion14;

public class Casa {
    //atributos de la clase casa
    private String ubicacion;
    private int pisos;
    private String color;

    //creo una variable para usar la clase enum y asignarle el valor del enum
    private Color colorEdificio = Color.AZUL; //ya es del tipo Color

    public static final Integer NUMERO_CASA = 123;  //constante q no se puede moficar (solo es lectura), no puede tener herencia en clases por ejemplo
//final debe llevar un valor si o si

    public static final String COLOR_ROJO = "rojo";
    public static final String COLOR_AMARILLO = "amarillo";
    public static final String COLOR_AZUL = "azul";

    //apuntar una valor de variable a una constante
    private final String color2 = COLOR_AZUL;

    //estas constantes de color las agregue a un enum q es lo mismo pero mas ordenaodo


    //variable para llamar a la clase enum de tipovivienda (debo implementar get y set)
    private TipoVivienda tipo;


    //creo id incremental para q cada vez q se cree un objeto de la clase este se autoincremente y se asigne
    private int id;
    private static int ultimoId;
    //actualizo el constructor
    public Casa(){
        this.id = ++ultimoId; //primero incrementa despues asigna
    }


    //atributo estatico
    private static String zinc = "estructural";

    // constructor (para pasar los datos)
    public Casa(String ubicacion, int pisos, String color) {
        this(); //llamo al constructor q pasa el id para q se autoincremente
        this.ubicacion = ubicacion;
        this.pisos = pisos;
        this.color = color;
    }
//get y set para el id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //get y set para color de edificio pasado por enum

    public Color getColorEdificio() {
        return colorEdificio;
    }

    public void setColorEdificio(Color colorEdificio) {
        this.colorEdificio = colorEdificio;
    }


    //sobrecarga de constructores
    //creo constructor vacio
//    public Casa(){
//        //permite crear objeto casa sin paramentros
//    }

    //y puedo crear constructores q solo pidan ciertos atributos
    public Casa(String color) {
        this.color = color;
    }

    //puedo llamar a otro constructor dentro de un constructor

    public Casa(String ubicacion, int pisos) {
        this(ubicacion); //llamo el constructor q ya lo implemento
        this.pisos = pisos;
    }


    //para acceder a atributos desde otra clase debo hacer un metodo para ello
    //y para modificar se crea los setters

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getZinc() {
        return zinc;
    }

    public static void setZinc(String zinc) {
        Casa.zinc = zinc;
    }

    public TipoVivienda getTipo() {
        return tipo;
    }

    public void setTipo(TipoVivienda tipo) {
        this.tipo = tipo;
    }




//metodos

    public String detalle (){
        return "id = " +this.id +
                "\nubicacion: "+this.ubicacion+"\n color: "+this.color+
                "\nzinc de tipo "+zinc; //no accedo con this xq es static
    }
    public int nPisos(int n){
        return this.pisos = n;
    }

    public String detalleEdificio(){
        return "ubicacion: "+this.ubicacion + "\ncolor desde enum: "+this.colorEdificio.getColor(); ///uso el get del enum Color para q sea personalizado
    }



    //sobreescritura de metodos
    //clik derecho generar overrride methods
    //@override solo indica q estamos sobreescribiendo un metodo de la clase padre
    @Override
    public boolean equals(Object obj) {
        //valido que la comparacion sea con otro tipo de objeto autp
        if(!(obj instanceof Casa)){
            return false; //break
        }
        //casteo
        Casa c = (Casa) obj;
        return (this.color != null && this.color.equalsIgnoreCase(c.getColor())); //comparo por color
    }





}
