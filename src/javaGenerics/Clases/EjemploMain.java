package javaGenerics.Clases;

public class EjemploMain {

    public static void main(String[] args) {

        //instanciar
        //Camion tranporteCaballos = new Camion(4);
        Camion<Animal> tranporteCaballos = new Camion<>(4); //paso el tipo generico

        tranporteCaballos.addObjeto(new Animal("pulga",TipoAnimal.CABALLO));
        tranporteCaballos.addObjeto(new Animal("galleta",TipoAnimal.CABALLO));
        tranporteCaballos.addObjeto(new Animal("joven",TipoAnimal.CABALLO));
        tranporteCaballos.addObjeto(new Animal("pinto",TipoAnimal.CABALLO));


        //for( Object o: tranporteCaballos){
        System.out.println("Transporte de animales");
        for( Animal a: tranporteCaballos){ //en lugar de object animal
            // Animal a = (Animal) o; //casteo (este ya no es necesario ya q converti la clase a generica
            //hace el casteo de forma automatica
            System.out.println(a.getNombre() + a.getTipo());
        }

       // imprimirCamion(tranporteCaballos); otra forma de imprimir los datos con el metodo generico


        //otra instancia
        //Camion transporteMaquinaria = new Camion(3);
        Camion <Maquinaria> transporteMaquinaria = new Camion<>(3);

        transporteMaquinaria.addObjeto( new Maquinaria("Niveladora"));
        transporteMaquinaria.addObjeto( new Maquinaria("cargador"));
        transporteMaquinaria.addObjeto( new Maquinaria("compactadora"));

//        for(Maquinaria m : transporteMaquinaria){
//           // Maquinaria m = (Maquinaria) o;
//            System.out.println(m.getTipo());
//        }

        System.out.println("\nTransporte de maquinaria");

        imprimirCamion(transporteMaquinaria);

    }

    //metodo generico para imprimir los datos para solo pasarlo una vez a todos
    public static <T> void imprimirCamion(Camion<T> camion){
        for(T c: camion){
           // System.out.println(t.getTipo()); no puedo acceder xq es generico
            //debo validar de quien quiero imprimir
            if( c instanceof Animal){ //si me refiero a transportes de animales
                System.out.println("Nombre: "+((Animal) c).getNombre() + "Tipo: "+((Animal) c).getTipo()); //obligado a hacer el cast
            }else{ //c instanceof Maquinaria
                    System.out.println( "Tipo: "+((Maquinaria) c).getTipo());
            }
        }
    }


}
