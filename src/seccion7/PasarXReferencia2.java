package seccion7;

//creo una clase persona
class Persona{
    //modicadores de acceso private public protected
    private String nombre;

    //toda variable de una clase debe ser privada
    //y solo se puede modificar mediante mtodos
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    //metodo para poder leer el nomnbre
    public String leerNombre(){
        return this.nombre;
    }

}

public class PasarXReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("andres");

        System.out.println("inicio en main = ");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println(" antes de *invocar metod test");

        test(persona); //modifica el arreglo

        System.out.println(" despues de invocar metodo test");
        System.out.println("persona = " + persona.leerNombre());
    }

    public static void test(Persona persona){
        System.out.println("inicio en metod test = " );
        persona.modificarNombre("ana");

    }

}
