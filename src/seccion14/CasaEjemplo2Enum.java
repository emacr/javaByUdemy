package seccion14;
public class CasaEjemplo2Enum {
    public static void main(String[] args) {

        Casa home = new Casa("bajo castillo",1,Casa.COLOR_AMARILLO); //paso la constante de color creada con final para 3vitar errores

        Casa soda = new Casa(); //sin parametros gracias al constructor vacio q cree


        Casa edificio = new Casa();
        edificio.setColorEdificio(Color.AZUL); //agrego el valor com el enum COLOR creado
        System.out.println("color edificio: "+edificio.getColorEdificio());
        System.out.println(edificio.detalleEdificio());

        Casa precario = new Casa();
        precario.setTipo(TipoVivienda.NO_APTA); //llamo al enum q tiene datos
        System.out.println("precario: "+precario.getTipo());

        TipoVivienda tipoPrecario = precario.getTipo();
        System.out.println("tipo precario: "+tipoPrecario.getDescripcion2());

        switch (tipoPrecario){
            case ALQUILADA :
                System.out.println("la casa es de alquiler");
                break;
            case NO_APTA:
                System.out.println("la casa no se puede alquilar");
                break;
            case PROPIA:
                System.out.println("la casa es propia");
                break;
            case PRESTADA:
                System.out.println("la casa es prestada");
                break;
        }

        //ahora desde java 13 existe un swith mejoradp
        //coloco flechas y no hace falta colocar break
        switch (tipoPrecario) {
            case ALQUILADA -> System.out.println("la casa es de alquiler");
            case PROPIA -> System.out.println("la casa es propia");
        }

        //los enum tambien son iterables
        TipoVivienda[] tipos = TipoVivienda.values();
        for(TipoVivienda tipoV : tipos){
            System.out.print(tipoV +" -> "+tipoV.name()+
                    " "+tipoV.getDescripcion2());
        }

        //enum tipoco = nombres de la semana
        //nombres de planeta (variable propia = masa,radio...)
        //meses (cantida de dias)
        //constantes = algo q no cambia

    }
}
