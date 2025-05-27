package seccion14;

public enum TipoVivienda {
    ALQUILADA ("casa1",2,"ver alquiler"), //paso los valores de los atributos de abajo
    PRESTADA ("casa2",1,"ver dueno"),
    PROPIA ("casa3",3,"ver propietario"),
    BUEN_ESTADO ("casa4",4,"verificar"),
    MAL_ESTADO ("casa5",1,"inspeccionar"),
    NO_APTA ("casa6",5,"no aplica");

//atributos
    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion2;


    //constructor

    TipoVivienda(String nombre, int numeroPuertas, String descripcion2) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion2 = descripcion2;
    }

    //metodos getter


    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion2() {
        return descripcion2;
    }
}
